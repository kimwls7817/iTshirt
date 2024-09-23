package com.example.day0416_a;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// 메인 액티비티 클래스 정의, AppCompatActivity를 상속받음
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 레이아웃 파일 설정
        setTitle("메인 액티비티");    // 타이틀 설정

        Button btnAdd = (Button) findViewById(R.id.btnAdd); // 더하기 버튼 찾기

        EditText edit1, edit2;  // 두 개의 EditText 변수 선언
        edit1 = (EditText) findViewById(R.id.edtNum1);
        edit2 = (EditText) findViewById(R.id.edtNum2);

        // 버튼 클릭 이벤트 리스너 설정
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                // EditText에서 입력받은 문자열을 정수로 변환하여 인텐트에 추가
                //정수로 형 변환
                intent.putExtra("Num1", Integer.parseInt(edit1.getText().toString()));
                intent.putExtra("Num2", Integer.parseInt(edit2.getText().toString()));

                // 결과를 받기 위해 SecondActivity를 시작
                // startActivity(intent); //단방향
                startActivityForResult(intent, 0);  //양방향
            }
        });
    }

    // SecondActivity로부터 결과를 받을 때 호출됨
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // 성공적으로 결과를 받았을 경우
        if(resultCode == RESULT_OK){
            int hap = data.getIntExtra("Hap", 0);   // 결과 값으로 받은 합계
            Toast.makeText(getApplicationContext(), "합계 ="+hap, Toast.LENGTH_LONG).show();  // 토스트 메시지로 합계 출력
        }
    }
}