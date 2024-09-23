package com.example.day0312_hello;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //현재 상태 저장
        setContentView(R.layout.activity_main); //메모리에 올리기

        TextView tid; //위젯 변수 선언
        tid = (TextView) findViewById(R.id.tid);
        tid.setTextColor(Color.GREEN);
        tid.setTextSize(25);

        Button btn;
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼을 꾹 눌러", Toast.LENGTH_LONG).show();
            }
        });
    }
}