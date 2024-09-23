package com.example.day0409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

// SecondActivity 클래스 정의, AppCompatActivity를 상속받음
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);    // 레이아웃 파일 설정
        setTitle("투표 결과");  // 타이틀 설정

        // 돌아가기 버튼
        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setBackgroundColor(Color.YELLOW); // 버튼의 배경색을 노란색으로 설정

        // MainActivity에서 보낸 인텐트를 받아옴
        Intent getintent = getIntent();
        int[] voteResult = getintent.getIntArrayExtra("VoteCount");     // 투표 결과 배열을 받아옴
        String[] imageName = getintent.getStringArrayExtra("ImageName");    // 이미지 이름 배열을 받아옴

        TextView tv [] = new TextView[9];   // 텍스트뷰 배열
        RatingBar rbar [] = new RatingBar[9];   // 레이팅바 배열

        // 텍스트뷰와 레이팅바의 ID 배열
        Integer tvId[] = {R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5,
                R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9};
        Integer rbarId[] = {R.id.rbar1, R.id.rbar2, R.id.rbar3, R.id.rbar4,
                R.id.rbar5, R.id.rbar6, R.id.rbar7, R.id.rbar8, R.id.rbar9};

        // 텍스트뷰와 레이팅바를 ID로 찾아서 배열에 저장
        for(int i=0; i<tv.length; i++)
        {
            tv[i] = findViewById(tvId[i]);
            rbar[i] = findViewById(rbarId[i]);
        }

        // 텍스트뷰와 레이팅바에 투표 결과를 표시
        for(int i=0; i<tv.length; i++)
        {
            tv[i].setText(imageName[i]);    // 텍스트뷰에 이미지 이름 설정
            rbar[i].setRating(voteResult[i]);   // 레이팅바에 투표 결과를 별점으로 표시
        }

        // 돌아가기 버튼 클릭 이벤트 처리
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();   // 현재 액티비티 종료, 즉 이전 화면으로 돌아감
            }
        });
    }
}