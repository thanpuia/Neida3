package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.marozzi.roundbutton.RoundButton;

public class thingfanghma extends AppCompatActivity {

    RoundButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thingfanghma);




    }

    public void VutbuakClick(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void a_hnah_kir_click(View view) {
        Intent intent = new Intent(this,Main3Activity_hnahkir.class);
        startActivity(intent);
    }

    public void a_hnah_rau_click(View view) {
        Intent intent = new Intent(this,Main4Activity_aHnahRau.class);
        startActivity(intent);
    }

    public void rahNatnaClick(View view) {
        Intent intent = new Intent(this,Main5Activity_rahNatna.class);
        startActivity(intent);
    }


    public void bawmtuVarClick(View view) {
        Intent intent = new Intent(this,Main6Activity_bawmtuVar.class);
        startActivity(intent);
    }

    public void thlawkVar_click(View view) {
        Intent intent = new Intent(this,Main7Activity_thlawkVar.class);
        startActivity(intent);
    }

    public void khau_Click(View view) {
        Intent intent = new Intent(this,Main8Activity_khau.class);
        startActivity(intent);
    }

    public void hnahTuiHnagDawtuClick(View view) {
        Intent intent = new Intent(this,Main9Activity_Hnah_tui_hnang_dawt_tu.class);
        startActivity(intent);
    }
}
