package com.example.day0319_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 위젯 전역변수 선언
    EditText edit1, edit2;
    Button plus, minus, multiply, divide;
    Button [] numButton = new Button[10];
    Integer numId [] = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9,};
    TextView textResult;
    String num1, num2;
    int i;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        textResult = findViewById(R.id.textResult);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);


        for(int i=0; i<numButton.length; i++)
            numButton[i] = findViewById(numId[i]);
            //numButton = findViewById(R.id.btn0); //이거 대신에 위를 사용.


        for (int i=0; i<numButton.length; i++)
        {
            int index = i;
            numButton[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                if (edit1.isFocused() == true) {
                    num1 = edit1.getText().toString() + numButton[index].getText().toString();
                    edit1.setText(num1);
                } else if (edit2.isFocused() == true) {
                    num2 = edit2.getText().toString() + numButton[index].getText().toString();
                    edit2.setText(num2);
                } else {
                    Toast.makeText(getApplicationContext(), "텍스트를 선택하시오.",
                            Toast.LENGTH_LONG).show();
                }
            }});
        }




        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();  //에티트텍스트1의 값 가져오기 : 문자열
                num2 = edit2.getText().toString();  //에티트텍스트2의 값 가져오기 : 문자열
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("더한 값 = "+result.toString());
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();  //에티트텍스트1의 값 가져오기 : 문자열
                num2 = edit2.getText().toString();  //에티트텍스트2의 값 가져오기 : 문자열
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("뺀 값 = "+result.toString());
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();  //에티트텍스트1의 값 가져오기 : 문자열
                num2 = edit2.getText().toString();  //에티트텍스트2의 값 가져오기 : 문자열
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("곱한 값 = "+result.toString());
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();  //에티트텍스트1의 값 가져오기 : 문자열
                num2 = edit2.getText().toString();  //에티트텍스트2의 값 가져오기 : 문자열
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("나눈 값 = "+result.toString());
            }
        });

    }
}