package com.jai.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    public void fade(View v) {
        ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.animate().translationYBy(-1000f).setDuration(2000);

        //ImageView homer = (ImageView) findViewById(R.id.homer);
        //homer.animate().alpha(1f).setDuration(2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
