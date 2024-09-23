package com.example.day0402_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button main;
    TextView title, act2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        main = findViewById(R.id.main);
        title = findViewById(R.id.title);
        act2 = findViewById(R.id.act2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("title");
        title.setText(str);

        String str2 = intent.getStringExtra("date");
        act2.setText("개봉일 : " + str2);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}