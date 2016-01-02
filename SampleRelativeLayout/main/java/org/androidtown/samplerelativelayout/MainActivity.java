package org.androidtown.samplerelativelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        setContentView(R.layout.normal);
    }

    public void onButton2Clicked(View v){
        setContentView(R.layout.overlay);
    }

    public void onButton3Clicked(View v){
        setContentView(R.layout.centerfill);
    }
}
