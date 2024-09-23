package com.example.day0402_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button act2, act3;
    EditText txt, date;
    RadioGroup rg;
    RadioButton r1, r2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act2 = findViewById(R.id.activity2);
        act3 = findViewById(R.id.activity3);
        txt = findViewById(R.id.txt);
        rg = findViewById(R.id.rg);
        r1 = findViewById(R.id.movie);
        r2 = findViewById(R.id.log);
        date = findViewById(R.id.date);

        intent = getIntent();
        intent.putExtra("title", txt.getText().toString());
        intent.putExtra("date", date.getText().toString());

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (r1.isChecked()) {
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("title", txt.getText().toString());
                    intent.putExtra("date", date.getText().toString());
                    startActivity(intent);
                }
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (r2.isChecked()) {
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    startActivity(intent);
                }
            }
        });

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("title", txt.getText().toString());
                intent.putExtra("date", date.getText().toString());
                startActivity(intent);
            }
        });

        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}