package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collections;

import static com.example.lalthanpuia.neida3.MainActivity.sound;

public class purunsen extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        if(sound)
            MainActivity.mediaPlayerBack.start();
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purunsen);

        getSupportActionBar().setTitle("Purunsen");

    }

    public void kung_hmawr_tawih_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main41Activity_purunsen_kungHmawrTawih.class);
        startActivity(intent);
    }

    public void hnah_tawih_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main42Activity_purunsen_ahnahTawih.class);
        startActivity(intent);
    }

    public void hnah_rau_val_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main43Activity_purunsen_hnah_rau.class);
        startActivity(intent);
    }

    public void hnah_rau_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main44Activity_a_hnah_rau_blight.class);
        startActivity(intent);
    }

    public void hnah_uai_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main45Activity_purunsen_aHnahVuai.class);
        startActivity(intent);
    }



    public void purunsen_thrips_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main46Activity_purunsen_hnah_ei_rangtu.class);
        startActivity(intent);
    }

    public void purun_hnah_hreuh_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main47Activity_purunsen_hnah_hreuh_rangtu.class);
        startActivity(intent);
    }

    public void purun_lung_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main49Activity_purunsen_lung.class);
        startActivity(intent);
    }

    public void tiak_sehchhutuPangaga_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main48Activity_purunsen_tiak_sehchhumtu.class);
        startActivity(intent);
    }
}
