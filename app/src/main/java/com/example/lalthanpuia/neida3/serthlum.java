package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class serthlum extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serthlum);
    }

    public void a_Kung_hnai_Click(View view) {
        Intent intent = new Intent(this,Main51Activity_serthlum_a_hnah_hnai.class);
        startActivity(intent);
    }

    public void kumthu_Click(View view) {
        Intent intent = new Intent(this,Main52Activity_serthlum_kumthu.class);
        startActivity(intent);
    }

    public void hnahRauCitrus_click(View view) {
        Intent intent = new Intent(this,Main53Activity_serthlum_a_hnah_rau.class);
        startActivity(intent);
    }

    public void vutbuakOrange_Click(View view) {
        Intent intent = new Intent(this,Main54Activity_serthlum_vutbuak.class);
        startActivity(intent);
    }

    public void rah_tawih_Click(View view) {
        Intent intent = new Intent(this,Main55Activity_rah_tawih.class);
        startActivity(intent);
    }

    public void katnelh_Click(View view) {
        Intent intent = new Intent(this,Main56Activity_serthlum_katnei.class);
        startActivity(intent);
    }

    public void hnahHruairangtu_click(View view) {
        Intent intent = new Intent(this,Main57Activity_serthlum_citurs_leaf.class);
        startActivity(intent);
    }

    public void kungKertuClick(View view) {
        Intent intent = new Intent(this,Main57Activity_serthlum_kung_kertu.class);
        startActivity(intent);
    }

    public void rah_dawttuClick(View view) {
    }

    public void rahdawttu_e_Click(View view) {
    }
}
