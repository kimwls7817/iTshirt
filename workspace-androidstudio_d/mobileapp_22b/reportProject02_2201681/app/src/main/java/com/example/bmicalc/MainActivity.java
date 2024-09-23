package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout lay1, lay2, lay3;
    EditText hight, weight;
    RadioGroup rg1;
    RadioButton male, female;
    Button calc, reset;
    ImageView bmi;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("BMI-Calculater_김예진");

        lay1 = findViewById(R.id.lay1);
        lay2 = findViewById(R.id.lay2);
        lay3= findViewById(R.id.lay3);

        hight = findViewById(R.id.hight);
        weight= findViewById(R.id.weight);

        rg1 = findViewById(R.id.rg1);
        male = findViewById(R.id.male);
        female= findViewById(R.id.female);

        calc= findViewById(R.id.calc);
        reset= findViewById(R.id.reset);

        bmi= findViewById(R.id.bmi);

        txt= findViewById(R.id.result);

        // 라디오버튼의 성별에 따라 bmi 이미지 표가 남성과 여성으로 달라짐. lay3번.
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.male:
                        bmi.setImageResource(R.drawable.malebmi);
                        break;
                    case R.id.female:
                        bmi.setImageResource(R.drawable.femalebmi);
                        break;
                    default:
                        bmi.setImageResource(R.drawable.basicbmi);
                }
            }
        });

        //계산하기 버튼을 누르면 bmi를 계산. lay4번의 결과들을 보여줌.
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay3.setVisibility(View.VISIBLE);

                float hightv = Float.parseFloat(hight.getText().toString());
                float weightv = Float.parseFloat(weight.getText().toString());

                float result = weightv / ((hightv / 100) * (hightv / 100)) ;

                txt.setText("당신이 BMI는 " + result + "입니다.");

            }
        });

        // 초기화 버튼. 모든 값이 소거됨.
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rg1.clearCheck();

                hight.setText(null);
                weight.setText(null);

                calc.setEnabled(true);
                lay3.setVisibility(View.INVISIBLE);
            }
        });
    }
}
