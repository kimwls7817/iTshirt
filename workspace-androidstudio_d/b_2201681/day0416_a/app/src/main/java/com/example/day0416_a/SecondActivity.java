package com.example.day0416_a;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// AppCompatActivity를 상속받는 SecondActivity 클래스
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);    // 이 액티비티의 레이아웃 설정
        setTitle("세컨드 액티비티");   // 액티비티 타이틀 설정

        Button btnReturn = findViewById(R.id.btnReturn);    // 반환 버튼 찾기

        Intent inIntent = getIntent();  // MainActivity로부터 전달받은 인텐트 가져오기
        // 두 숫자의 합을 계산
        int sum = inIntent.getIntExtra("Num1", 0) + inIntent.getIntExtra("Num2", 0);

        // 반환 버튼에 클릭 리스너 설정
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("Hap", sum); // 계산된 합을 결과 인텐트에 추가
                setResult(RESULT_OK, outIntent);    //응답보내기  // MainActivity로 결과 설정 및 전송
                finish();   // SecondActivity 종료
            }
        });
    }
}