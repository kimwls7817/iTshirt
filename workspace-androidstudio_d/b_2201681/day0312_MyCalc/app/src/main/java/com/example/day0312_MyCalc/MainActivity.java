package com.example.day0312_MyCalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1, b2, b3, b4;
    EditText e1, e2;
    TextView txt;   //위젯 전역 변수
    int x, y, z;

    //방법1일땐 public void onClick(View view)
    //방법2일땐 public void onClick(View v)
    @Override
    public void onClick(View v) {
        x = Integer.parseInt(e1.getText().toString());
        y = Integer.parseInt(e2.getText().toString());

        //방법2
        if (v == b1)
            z = x+y;
        else if (v == b2) {
            z = x-y;
        }
        else if (v == b3) {
            z = x*y;
        }
        else if(v == b4) {
            z = x/y;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btn1);  //더하기
        b2 = (Button) findViewById(R.id.btn2);  //빼기
        b3 = (Button) findViewById(R.id.btn3);  //곱하기
        b4 = (Button) findViewById(R.id.btn4);  //나누기
        e1 = findViewById(R.id.num1);
        e1 = findViewById(R.id.num2);
        txt = findViewById(R.id.result);

        //방법2
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

//        //방법1
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                x = Integer.parseInt(e1.getText().toString());
//                y = Integer.parseInt(e2.getText().toString());
//                z = x + y;
//                txt.setText("계산 결과 : " + z);
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                x = Integer.parseInt(e1.getText().toString());
//                y = Integer.parseInt(e2.getText().toString());
//                z = x - y;
//                txt.setText("계산 결과 : " + z);
//            }
//        });
//
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                x = Integer.parseInt(e1.getText().toString());
//                y = Integer.parseInt(e2.getText().toString());
//                z = x * y;
//                txt.setText("계산 결과 : " + z);
//            }
//        });
//
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                x = Integer.parseInt(e1.getText().toString());
//                y = Integer.parseInt(e2.getText().toString());
//                z = x / y;
//                txt.setText("계산 결과 : " + z);
//            }
//        });

    }
}