package com.amirzregat.grillmark;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class deliveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
    }

    public void backClick(View view) {
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }

    public void FcallClick(View view) {
        Intent callIntent= new Intent();
        callIntent.setAction(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0795258181"));
        startActivity(callIntent);
    }

    public void ScallClick(View view) {

        Intent callIntent= new Intent();
        callIntent.setAction(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0799717292"));
        startActivity(callIntent);
    }
}
