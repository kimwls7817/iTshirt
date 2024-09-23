package com.example.day0409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

// 메인 액티비티 클래스 정의, AppCompatActivity를 상속받음
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 액티비티의 레이아웃을 설정
        setTitle("명화 선호도 투표");  // 액티비티의 타이틀을 설정


        // 결과 확인 버튼을 찾고 배경색을 노란색으로 설정
        Button btnResult = findViewById(R.id.btnResult);
        btnResult.setBackgroundColor(Color.YELLOW);

        // 투표 수를 저장할 배열을 초기화, 모든 명화의 투표 수는 0으로 시작
        final int voteCount[] = new int[9]; //투표 횟수
        for(int i=0; i<9; i++)
            voteCount[i] = 0;

        // 이미지 뷰 객체를 저장할 배열
        ImageView image[] = new ImageView[9];   //이미지배열변수
        Integer imageId[] = {R.id.iv1, R.id.iv2, R.id.iv3, R.id.iv4, R.id.iv5,
                R.id.iv6, R.id.iv7, R.id.iv8, R.id.iv9};
        //이미지 아이디 가져오기  // 각 이미지 뷰의 ID 배열
        String imageName[] = {"별이 빛나는 밤", "소녀", "정원", "이삭줍는 여인들",
                "진주귀걸이를 한 소녀", "여인", "죽음", "연인1", "연인2"};
        // 각 이미지의 이름 배열

        // 각 이미지에 클릭 리스너를 설정
        for(int i=0; i<imageId.length; i++)
        {
            int index = i;
            image[index] = findViewById(imageId[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    voteCount[index]++; // 클릭 시 해당 이미지의 투표 수 증가
                    Toast.makeText(getApplicationContext(),
                            imageName[index] + " 총: " + voteCount[index] + " 표: ", Toast.LENGTH_SHORT).show();
                    // 투표 수를 토스트 메시지로 보여줌
                }
            });
        }

        // 결과 보기 버튼의 클릭 이벤트 처리
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                // 결과를 보여줄 SecondActivity로의 인텐트 생성

                intent.putExtra("VoteCount", voteCount);
                // 인텐트에 투표 수 배열 추가
                intent.putExtra("ImageName", imageName);
                // 인텐트에 이미지 이름 배열 추

                startActivity(intent);  // SecondActivity 시작
            }
        });
    }
}