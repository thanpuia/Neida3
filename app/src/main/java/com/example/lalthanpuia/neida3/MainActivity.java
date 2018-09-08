package com.example.lalthanpuia.neida3;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById( R.id.toolbar );
        //setSupportActionBar( toolbar );

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );

        drawer.addDrawerListener( toggle );
        toggle.syncState();
      //  navigationView.setNavigationItemSelectedListener( );
    }



    public void papaya(View view) {
        Intent intent = new Intent(this,thingfanghma.class);
        startActivity(intent);
    }


    public void zikhlumClick(View view) {
        Intent intent = new Intent(this,zikhlum.class);
        startActivity(intent);
    }

    public void balhlaClick(View view) {
        Intent intent = new Intent(this,balhla.class);
        startActivity(intent);
    }

    public void purunClick(View view) {
        Intent intent = new Intent(this,purunsen.class);
        startActivity(intent);
    }

    public void serthlumClick(View view) {
        Intent intent = new Intent(this,serthlum.class);
        startActivity(intent);
    }

    public void vaimimClick(View view) {
        Intent intent = new Intent(this,vaimim.class);
        startActivity(intent);
    }

    public void whatapa(View view) {
        WhatsApp whatsApp= new WhatsApp();
        whatsApp.whatsappSend();
    }
}
