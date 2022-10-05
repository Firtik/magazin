package com.example.magazin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }
    public void openSite(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://itproger.com/"));
        startActivity(intent);
    }
    public void openMainPage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openAboutPage(View view){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }
}