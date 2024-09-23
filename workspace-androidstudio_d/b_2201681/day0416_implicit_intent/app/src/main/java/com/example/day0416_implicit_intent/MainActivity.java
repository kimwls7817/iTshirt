package com.example.day0416_implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // 레이아웃 설정

        Button [] btn = new Button[7];  // 버튼 배열 생성
        Integer [] btnId = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                R.id.btn5, R.id.btn6, R.id.btn7};  // 버튼 ID 배열
        for (int i=0; i<btn.length; i++)
            btn[i] = findViewById(btnId[i]);  // 각 버튼을 ID로 찾아 배열에 할당

        // 전화 걸기 버튼
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:01032747817");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);  // 전화 다이얼 인텐트 생성
                startActivity(intent);  // 인텐트 실행
            }
        });

        // 홈페이지 열기 버튼
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.naver.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);  // 웹 브라우저 인텐트 생성
                startActivity(intent);  // 인텐트 실행
            }
        });

        // 구글 맵 열기 버튼
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.co.kr/maps/?hl=ko&entry=ttu");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);  // 지도 앱 인텐트 생성
                startActivity(intent);  // 인텐트 실행
            }
        });

        // 검색 버튼
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEARCH);  // 검색 인텐트 생성
                intent.putExtra(SearchManager.QUERY, "안드로이드");  // 검색어 설정
                startActivity(intent);  // 인텐트 실행
            }
        });

        // 문자 보내기 버튼
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);  // 문자 보내기 인텐트 생성
                intent.putExtra("sms_body", "안녕하세요");  // 문자 내용 설정
                intent.setData(Uri.parse("smsto:" + Uri.encode("010-1111-4567")));  // 수신자 설정
                startActivity(intent);  // 인텐트 실행
            }
        });

        // 사진 찍기 버튼
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);  // 카메라 촬영 인텐트 생성
                startActivity(intent);  // 인텐트 실행
            }
        });

        // 다른 프로젝트 열기 버튼
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();  // 일반 인텐트 생성
                intent.setClassName("com.example.day0416_a", "com.example.day0416_a.MainActivity");  // 특정 액티비티 지정
                startActivity(intent);  // 인텐트 실행
            }
        });
    }
}
