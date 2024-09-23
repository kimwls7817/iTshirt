package com.example.day0507_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RollingballActivity extends AppCompatActivity {

    BilliardBall ball;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.rollingball);
        ball = new BilliardBall(this);
        setContentView(ball);
        setTitle("당구공");
    }
}