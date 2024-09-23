package com.example.scorecalc;

import static android.view.View.*;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout lineshow1, lineshow2, lineshow3;
    TextView text1, text2, text3;
    Switch start;
    EditText name, score1, score2, score3, score4;
    RadioGroup grade;
    Button calculate, reset;
    ImageView ImgScore;
    String Grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("2201681/김예진_학점 계산기");

        lineshow1 = (LinearLayout) findViewById(R.id.lineshow1);
        lineshow2 = (LinearLayout) findViewById(R.id.lineshow2);
        lineshow3 = (LinearLayout) findViewById(R.id.lineshow3);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);

        start = (Switch) findViewById(R.id.start);

        name = (EditText) findViewById(R.id.name);
        score1 = (EditText) findViewById(R.id.score1);
        score2 = (EditText) findViewById(R.id.score2);
        score3 = (EditText) findViewById(R.id.score3);
        score4 = (EditText) findViewById(R.id.score4);

        grade = (RadioGroup) findViewById(R.id.grade);

        calculate = (Button) findViewById(R.id.calculate);
        reset = (Button) findViewById(R.id.reset);

        ImgScore = (ImageView) findViewById(R.id.ImgScore);

        // 시작하기 버튼을 누르면 lineshow2번이 보임.
        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lineshow2.setVisibility(View.VISIBLE);
                } else {
                    lineshow2.setVisibility(View.INVISIBLE);
                }
            }
        });

        // 라디오 버튼으로 학년 선택.
        grade.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.first:
                        Log.d("Grade", "1학년");
                        Grade = "1학년";
                        break;
                    case R.id.second:
                        Log.d("Grade", "2학년");
                        Grade = "2학년";
                        break;
                    case R.id.third:
                        Log.d("Grade", "3학년");
                        Grade = "3학년";
                        break;
                    default:
                        Log.d("Grade", "4학년");
                        Grade = "4학년";
                }
            }
        });

        // 총 점수를 계산함과 동시에 lineshow3번을 visible로 바꿔 결과값과 학점 이미지가 보이게 함.
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lineshow3.setVisibility(View.VISIBLE);

                float score1Value = Float.parseFloat(score1.getText().toString());
                float score2Value = Float.parseFloat(score2.getText().toString());
                float score3Value = Float.parseFloat(score3.getText().toString());
                float score4Value = Float.parseFloat(score4.getText().toString());

                float result = (score1Value + score2Value + score3Value + score4Value) / 4;

                String gradeText = Grade + " " + name.getText().toString() + " 학생의 총 점수는 ";
                if (result >= 95) {
                    text3.setText(gradeText + "A+학점 입니다.");
                    ImgScore.setImageResource(R.drawable.aplus);
                } else if (result >= 90) {
                    text3.setText(gradeText + "A학점 입니다.");
                    ImgScore.setImageResource(R.drawable.a);
                } else if (result >= 85) {
                    text3.setText(gradeText + "B+학점 입니다.");
                    ImgScore.setImageResource(R.drawable.bplus);
                } else if (result >= 80) {
                    text3.setText(gradeText + "B학점 입니다.");
                    ImgScore.setImageResource(R.drawable.b);
                } else if (result >= 75) {
                    text3.setText(gradeText + "C+학점 입니다.");
                    ImgScore.setImageResource(R.drawable.cplus);
                } else if (result >= 70) {
                    text3.setText(gradeText + "C학점 입니다.");
                    ImgScore.setImageResource(R.drawable.c);
                } else {
                    text3.setText(gradeText + "F학점 입니다.");
                    ImgScore.setImageResource(R.drawable.f);
                }
            }
        });


        // 초기화 버튼. 시작하기 스위치를 끈 상태로 돌아감.
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start.setChecked(false);

                name.setText(null);
                grade.clearCheck();

                score1.setText(null);
                score2.setText(null);
                score3.setText(null);
                score4.setText(null);

                calculate.setEnabled(true);
                lineshow3.setVisibility(View.INVISIBLE);
            }
        });


    }
}
