package com.amirzregat.grillmark;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void menuClick(View view) {
        Intent intent=new Intent(this,Menu.class);
        startActivity(intent);
    }

    public void deliveryClick(View view) {
        Intent intent=new Intent(this,deliveryActivity.class);
        startActivity(intent);
    }

    public void locClick(View view) {
        Intent intent=new Intent(this,locationActivity.class);
        startActivity(intent);
    }

    public void instaClick(View view)
    {
    Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/grillmarkjo/"));
    startActivity(browserIntent);
    }

    public void snapClick(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.snapchat.com/add/grillmark"));
        startActivity(browserIntent);
    }

    public void faceClick(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://web.facebook.com/grillmark/?ref=br_rs"));
        startActivity(browserIntent);
    }
}
