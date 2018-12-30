package com.amirzregat.grillmark;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class locationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }

    public void ammanLocClick(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:31.973023, 35.840947"));
        startActivity(intent);

    }

    public void IrbidLocClick(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:32.540375, 35.868673"));
        startActivity(intent);
    }

    public void backClick(View view) {
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }
}
