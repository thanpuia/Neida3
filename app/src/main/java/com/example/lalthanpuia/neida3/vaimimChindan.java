package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.lalthanpuia.neida3.MainActivity.sound;

public class vaimimChindan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaimim_chindan);

    }

    public void coverClick1(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,img_vaimim_chindan1.class);
        startActivity(intent);

    }
    public void coverClick2(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,img_vaimim_chindan2.class);
        startActivity(intent);

    }
    public void coverClick3(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,img_vaimim_chindan3.class);
        startActivity(intent);

    }
    public void coverClick4(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,img_vaimim_chindan4.class);
        startActivity(intent);

    }
    public void coverClick5(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,img_vaimim_chindan5.class);
        startActivity(intent);

    }
    public void coverClick6(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,img_vaimim_chindan6.class);
        startActivity(intent);

    }
    public void coverClick7(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,img_vaimim_chindan7.class);
        startActivity(intent);

    }
}
