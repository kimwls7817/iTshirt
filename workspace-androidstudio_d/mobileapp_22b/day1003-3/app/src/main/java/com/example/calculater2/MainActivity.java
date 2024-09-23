package com.example.calculater2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText ed1, ed2;
    Button b1, b2, b3, b4;
    TextView textResult;
    String num1, num2;
    Integer result;

    //2번째 방법
//    class Test implements View.OnClickListener{
//
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(getApplicationContext(),"두번째 버튼 클릭",Toast.LENGTH_LONG)
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초 간단 계산기");

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        textResult = findViewById(R.id.result);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        //3번 방법
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"세번째 버튼 클릭",Toast.LENGTH_LONG)
//            }
//        });
    }
    public void onClick(View view) {
        num1 = ed1.getText().toString();
        num2 = ed2.getText().toString();

        if(view == b1)
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
        else if(view == b2)
            result = Integer.parseInt(num1) - Integer.parseInt(num2);
        else if(view == b3)
            result = Integer.parseInt(num1) * Integer.parseInt(num2);
        else if(view == b4)
            result = Integer.parseInt(num1) / Integer.parseInt(num2);

        textResult.setText("계산 결과= "+result.toString());
    }

//    @Override
//    //1번 방법
//    public void onClick(View view) {
//        Toast.makeText(getApplicationContext(), "첫번째 버튼 클릭",Toast.LENGTH_LONG).show();
//    }
}