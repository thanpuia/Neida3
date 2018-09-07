package com.example.lalthanpuia.neida3;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class whatsapp extends AppCompatActivity {

    public void whatsAppSend(){
        try {

            String toNumber = "9436153649";
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + "" + toNumber+ "?body=" + ""));
            sendIntent.setPackage("com.whatsapp");
            startActivity(sendIntent);
        }
        catch (Exception e){
            e.printStackTrace();
           // Toast.makeText(MainActivity.this,"it may be you dont have whats app",Toast.LENGTH_LONG).show();

        }

    }
}
