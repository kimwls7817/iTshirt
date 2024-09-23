package com.example.day0402_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    Button back, ok;

    EditText idnumber, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        back = findViewById(R.id.back);
        ok = findViewById(R.id.ok);
        idnumber = findViewById(R.id.idnumber);
        password = findViewById(R.id.password);

        // 메인으로 가기 동작
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = password.getText().toString();

                if(idnumber.getText().toString().equals("kim") && a.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "로그인 성공", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "로그인 실패", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
