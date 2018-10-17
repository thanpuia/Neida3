package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.lalthanpuia.neida3.MainActivity.sound;

public class balhla extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        if(sound)
            MainActivity.mediaPlayerBack.start();
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balhla);

        getSupportActionBar().setTitle("Balhla");
    }

    public void A_tam_hri_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main31Activity_balhla_tam_hri.class);
        startActivity(intent);
    }

    public void than_thu_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main32Activity_balhla_than_thut.class);
        startActivity(intent);
    }

    public void a_hnah_de_eng_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main33Activity_hnah_de_eng.class);
        startActivity(intent);
    }

    public void hnah_leh_rah_rau_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main34Activity_hnah_leh_rah_rau.class);
        startActivity(intent);
    }

    public void banana_thrips_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main35Activity_balhla_thrips.class);
        startActivity(intent);
    }

    public void banana_aphid_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main36Activity_aphid.class);
        startActivity(intent);
    }

    public void pseudostem_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main37Activity_balhla_PSEUDOSTEMBORER.class);
        startActivity(intent);
    }

    public void fruit_Leaf_beetle_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main37Activity_balhla_fruitandLeaf_scarring.class);
        startActivity(intent);
    }
}
