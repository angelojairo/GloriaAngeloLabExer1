package com.gloria.september14;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void displayRosarium(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://ph21stcenturypark.blogspot.com/2012/10/rosarium-ust-kalaw-roy.html"));
        startActivity(intent);
    }
    public void displayBotanical(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://cityseeker.com/manila/310456-ust-botanical-gardens"));
        startActivity(intent);
    }
    public void displayHospital(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.usthospital.com.ph/"));
        startActivity(intent);
    }
    public void displayQpav(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://varsitarian.net/features/20120507/the_quadricentennial_pavilion"));
        startActivity(intent);
    }
}

