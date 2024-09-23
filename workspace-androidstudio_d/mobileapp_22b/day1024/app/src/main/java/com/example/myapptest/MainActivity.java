package com.example.myapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout lshow1, lshow2, lshow3;
    TextView result;
    Switch start;
    EditText num1, num2;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("중간고사_계산기_/김예진");

        lshow1 = (LinearLayout) findViewById(R.id.lshow1);
        lshow2 = (LinearLayout) findViewById(R.id.lshow2);
        lshow3 = (LinearLayout) findViewById(R.id.lshow3);

        start = (Switch) findViewById(R.id.start);
        add = (Button) findViewById(R.id.add);
        result = (TextView) findViewById(R.id.result);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lshow2.setVisibility(View.VISIBLE);
                } else {
                    lshow2.setVisibility(View.INVISIBLE);
                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lshow3.setVisibility(View.VISIBLE);

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());

                float num3 = number1 + number2;

                String result = num3;
            }
        });
    }
}