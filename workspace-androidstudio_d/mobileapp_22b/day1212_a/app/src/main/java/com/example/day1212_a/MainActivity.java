package com.example.day1212_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {   //AppCompatActivity에서 상속받은 것.

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //onCreate
        super.onCreate(savedInstanceState);     //부모의 것을 호출해라.
        setContentView(R.layout.activity_main);     //레이아웃인플레이터, 메모리 확보의 영역.(메모리 올리기 )
        setTitle("제목");
    }
}