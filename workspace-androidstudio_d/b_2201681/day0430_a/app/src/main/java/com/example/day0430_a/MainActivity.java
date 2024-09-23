package com.example.day0430_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 페이지");

        Button btnWrite, btnRead, btnGo2, btnRaw;
        EditText editText;

        btnWrite = findViewById(R.id.btnWrite);
        btnRead = findViewById(R.id.btnRead);
        btnGo2 = findViewById(R.id.btnGo2);
        btnRaw = findViewById(R.id.btnRaw);

        editText = findViewById(R.id.edtText);

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream outf = openFileOutput("file.txt", Context.MODE_PRIVATE);
                    String str = "안녕하세요:) \n 모바일 프로그램";
                    outf.write(str.getBytes());
                    outf.close();
                    Toast.makeText(getApplicationContext(), "file.txt가 생성되었습니다!!", Toast.LENGTH_LONG).show();
                }catch(IOException e){
                    Toast.makeText(getApplicationContext(), "공간이 부족합니다.", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileInputStream inf = openFileInput("file.txt");
                    byte [] txt = new byte[100];
                    inf.read(txt);
                    String str = new String(txt);
                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
                }catch(IOException e){
                    Toast.makeText(getApplicationContext(), "파일이 없습니다!!", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnRaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    InputStream inf = getResources().openRawResource(R.raw.daily);
                    byte [] txt = new byte[inf.available()];
                    inf.read(txt);
                    editText.setText(new String(txt));
                    inf.close();
                }catch(IOException e){

                }
            }
        });

        btnGo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DiaryActivity.class);
                startActivity(intent);

            }
        });
    }
}