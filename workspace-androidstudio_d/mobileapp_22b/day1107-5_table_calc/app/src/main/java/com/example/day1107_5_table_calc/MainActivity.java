package com.example.day1107_5_table_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    EditText edit1, edit2;
    Button btnAdd, btnMinus, btnMult, btnDvide, btnRemain;
    TextView TextResult;
    String num1, num2;
    Integer result;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = { R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9 };
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블 레이아웃 계산기");   //p.227

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        TextResult = findViewById(R.id.TextResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnTouchListener(this);
//        btnAdd.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent)
//            {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) + Integer.parseInt(num2);
//                TextResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });

        btnMinus = findViewById(R.id.btnMinus);
        btnMinus.setOnTouchListener(this);
//        btnMinus.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent)
//            {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) - Integer.parseInt(num2);
//                TextResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });

        btnMult = findViewById(R.id.btnMult);
        btnMult.setOnTouchListener(this);
//        btnMult.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent)
//            {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) * Integer.parseInt(num2);
//                TextResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });

        btnDvide = findViewById(R.id.btnDvide);
        btnDvide.setOnTouchListener(this);
//        btnDvide.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent)
//            {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) / Integer.parseInt(num2);
//                TextResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });

        btnRemain = findViewById(R.id.btnRemain);
        btnRemain.setOnTouchListener(this);
//        btnRemain.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent)
//            {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) % Integer.parseInt(num2);
//                TextResult.setText("계산 결과 : " + result.toString());
//                return false;
//            }
//        });

        for(i=0; i<numBtnIDs.length; i++) {
            numButtons[i] = findViewById(numBtnIDs[i]);
        }

        for(i=0; i<numBtnIDs.length; i++)   //p.228
        {
            int index;
            index = i;
            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {    //p.228
                    if(edit1.isFocused() == true){
                        num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                        edit1.setText(num1);
                    } else if(edit2.isFocused() == true){
                        num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(),"먼저 에디트텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent)
    {
        num1 = edit1.getText().toString();
        num2 = edit2.getText().toString();
        if (view == btnAdd) {
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
        }else if (view == btnMinus) {
            result = Integer.parseInt(num1) - Integer.parseInt(num2);
        }else if (view == btnMult) {
            result = Integer.parseInt(num1) * Integer.parseInt(num2);
        }else if (view == btnDvide) {
            result = Integer.parseInt(num1) / Integer.parseInt(num2);
        }else {
            result = Integer.parseInt(num1) % Integer.parseInt(num2);
        }
        TextResult.setText("계산 결과" + result.toString());
        return false;
    }
}
