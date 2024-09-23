package com.example.day0319_project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();
    Button b1, b2;//객체생성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        mediaPlayer.start();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start():
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop():
            }
        });

        Uri uri = Uri.parse("android.resource://com.example.day0319_project"+R.raw_stumovie);   //파일이 있는 결로를 지정.
        VedieView v = (VideoView)findViewById(R.id.bird);
        v.setVideoURI(uri);
        v.start();
        v.setVisibility(View.VISIBLE);
    }
}