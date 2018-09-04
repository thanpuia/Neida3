package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class vaimim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaimim);
    }

    public void natna1_Click(View view) {
        Intent intent = new Intent(this,Main61Activity_vaimim_KuangTawih.class);
        startActivity(intent);
    }

    public void natna2_Click(View view) {
        Intent intent = new Intent(this,Main62Activity_vaimim_a_kuang_meihawl.class);
        startActivity(intent);
    }

    public void natna3_click(View view) {
        Intent intent = new Intent(this,Main63Activity_vaimim_hnah_rau.class);
        startActivity(intent);
    }

    public void natna4_Click(View view) {
        Intent intent = new Intent(this,Main63Activity_vaimim_Hnah_rau_val.class);
        startActivity(intent);
    }

    public void hri1_Click(View view) {
        Intent intent = new Intent(this,Main65Activity_vaimim_kau_eitu.class);
        startActivity(intent);
    }

    public void hri2_click(View view) {
    }

    public void hri3_Click(View view) {
    }

    public void hri4_Click(View view) {
    }
}
