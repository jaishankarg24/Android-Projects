package com.jai.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setVideoPath("android.resourse://" + getPackageName() + "/" + R.raw.demovideo);
        videoView.start();
    }
}
