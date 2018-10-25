package com.example.lalthanpuia.neida3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.lalthanpuia.neida3.sampledata.CustomListView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        public static MediaPlayer mediaPlayer;
        public static MediaPlayer mediaPlayerSent;
        public static MediaPlayer mediaPlayerBack;

        public static boolean sound = true;
        public static SharedPreferences sharedPreferences;

    Random rand = new Random();

    LinearLayout banner;

    CustomListView lv;
    Integer[] images;
    ImageView imageView;

   /* public void bannerClick(View view) {

        try{

            if(sound)
                mediaPlayer.start();

            int [] anim = new int[]{R.anim.diagonal_right_enter,R.anim.zoom_enter,R.anim.card_enter,
                    R.anim.fade_enter,R.anim.shrink_enter,R.anim.windmill_enter,R.anim.slide_up_enter,
                    R.anim.fade_enter,R.anim.spin_enter,R.anim.slide_in_left,R.anim.swipe_left_enter,
                    R.anim.split_enter,R.anim.zoom_enter,R.anim.in_out_enter};

            int newRand = rand.nextInt(14);
            Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),anim[newRand]);
            banner.startAnimation(animation);

        }catch (Exception e){}

    }*/
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater =getMenuInflater();
            menuInflater.inflate(R.menu.main_menu,menu);

            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            super.onOptionsItemSelected(item);

                    return true;


        }

        public void soundMode(Boolean mode){
            sharedPreferences.edit().putBoolean("soundMode", mode).apply();
        }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById( R.id.toolbar );

            mediaPlayer = MediaPlayer.create(this,R.raw.sound1);
            mediaPlayerSent = MediaPlayer.create(this,R.raw.sent);
            mediaPlayerBack = MediaPlayer.create(this,R.raw.backward);

            banner = findViewById(R.id.banner);

            sharedPreferences = this.getSharedPreferences("com.example.lalthanpuia.neida3",Context.MODE_PRIVATE);
            Boolean mode = sharedPreferences.getBoolean("soundMode", false);

            if(mode)
                sound = true;
            else if (!mode)
                sound = false;

        images = new Integer[]{R.drawable.papaya_button, R.drawable.zikhlum_button_two, R.drawable.balhlabutton, R.drawable.purninsenbutton, R.drawable.serthlumbutton, R.drawable.vaimimbutton};

        CustomAdapter customAdapter = new CustomAdapter();
        lv = findViewById(R.id.list_item);

        lv.setAdapter(customAdapter);

        //setSupportActionBar( toolbar );
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );

        drawer.addDrawerListener( toggle );
        toggle.syncState();
        //  navigationView.setNavigationItemSelectedListener( );

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplication(),""+position,Toast.LENGTH_SHORT).show();
            switch (position){
                case 0: Intent intent = new Intent(getApplicationContext(),thingfanghma.class);
                    if(sound)
                        mediaPlayer.start();
                    startActivity(intent);break;
                case 1: Intent intent1 = new Intent(getApplicationContext(),ZikhlumNew.class);
                    if(sound)
                        mediaPlayer.start();
                    startActivity(intent1);break;
                case 2: Intent intent2 = new Intent(getApplicationContext(),balhla.class);
                    if(sound)
                        mediaPlayer.start();
                    startActivity(intent2);break;
                case 3: Intent intent3 = new Intent(getApplicationContext(),purunsen.class);
                    if(sound)
                        mediaPlayer.start();
                    startActivity(intent3);break;
                case 4: Intent intent4 = new Intent(getApplicationContext(),serthlum.class);
                    if(sound)
                        mediaPlayer.start();
                    startActivity(intent4);break;
                case 5: Intent intent5 = new Intent(getApplicationContext(),vaimim.class);
                    if(sound)
                        mediaPlayer.start();
                    startActivity(intent5);break;
            }

            }
        });
    }
   // int x=0;


    public void soundClick(MenuItem item) {
        if(sound){
            sound = false;
            soundMode(sound);
            Toast.makeText(this,"Sound Off",Toast.LENGTH_LONG).show();

        }else {
            sound = true;
            mediaPlayer.start();
            soundMode(sound);
            Toast.makeText(this,"Sound On",Toast.LENGTH_LONG).show();

        }
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.custom_row,null);

            imageView = convertView.findViewById(R.id.image);

            imageView.setImageResource(images[position]);

            return convertView;
        }
    }


}
