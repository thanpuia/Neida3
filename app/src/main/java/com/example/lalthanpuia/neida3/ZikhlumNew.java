package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.lalthanpuia.neida3.MainActivity.sound;

public class ZikhlumNew extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        if(sound)
            MainActivity.mediaPlayerBack.start();
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zikhlum_new);

        getSupportActionBar().setTitle("Zikhlum");

    }

    public void A_hnah_tawih_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main10Activity_zikhlum_hnahTawih.class);
        startActivity(intent);
    }

    public void hnar_rau_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main11Activity_zikhlum_hnahRau.class);
        startActivity(intent);

    }

    public void a_tiak_lawng_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main12Activity_zikhlum__tiak_lawng.class);
        startActivity(intent);


    }

    public void a_hnahhnuailam_var_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main13Activity_zikhum_hnah_hnuailam_var.class);
        startActivity(intent);


    }

    public void zikhlum_hrik_Click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main14Activity_zikhlum_hri.class);
        startActivity(intent);
    }

    public void pangangte_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main15Activity_zikhlum_pangangte.class);
        startActivity(intent);
    }

    public void hnah_car_khawmtu_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main16Activity_zikhlum_hnah_char_khawmtu.class);
        startActivity(intent);
    }

    public void a_tiak_sehchhumtu_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main17Activity_zikhlum_tiak_sehchhumtu.class);
        startActivity(intent);
    }

    public void pangang_hring_click(View view) {
        if(sound)
            MainActivity.mediaPlayer.start();
        Intent intent = new Intent(this,Main18Activity_zikhlum_pangang_hring.class);
        startActivity(intent);
    }

}
