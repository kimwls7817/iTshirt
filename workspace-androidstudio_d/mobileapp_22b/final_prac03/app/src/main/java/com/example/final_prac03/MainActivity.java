package com.example.final_prac03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("뷰 컨테이너");

        Button Pre, Nxt;
        ViewFlipper Flip;

        Pre = findViewById(R.id.btn1);
        Nxt = findViewById(R.id.btn2);
        Flip = findViewById(R.id.viewFlipper);

        Pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Flip.showPrevious();
            }
        });

        Nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Flip.showNext();
            }
        });
    }
}