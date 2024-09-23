package com.example.report01_2024_2201681;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class DiaryActivity extends AppCompatActivity {

    Button btnReturn, btnSave;
    DatePicker datePicker1;
    EditText editDiary;
    String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);

        btnSave = findViewById(R.id.btnSave);
        btnReturn = findViewById(R.id.btnReturn);
        datePicker1 = findViewById(R.id.datePicker1);
        editDiary = findViewById(R.id.edtDiary);

        Calendar cal = Calendar.getInstance();

        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH);
        int cDay = cal.get(Calendar.DAY_OF_MONTH);

        datePicker1.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                fileName = Integer.toString(year) + "_" + Integer.toString(monthOfYear+1) + "_" +
                        Integer.toString(dayOfMonth)  + ".txt";
                String str = readDiary(fileName);
                editDiary.setText(str);
                btnSave.setEnabled(true);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream outf = openFileOutput(fileName, Context.MODE_PRIVATE);
                    String str = editDiary.getText().toString();
                    outf.write(str.getBytes());
                    Toast.makeText(getApplicationContext(), fileName + "이 저장되었습니다. ", Toast.LENGTH_LONG).show();
                }catch (IOException e){
                    Toast.makeText(getApplicationContext(), "파일이 없습니다. ", Toast.LENGTH_LONG).show();
                }
            }
        });

        ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);    //허용을 묻는 창 표시

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    String readDiary(String fName){
        String diaryStr = null;
        FileInputStream inf;
        try{
            inf = openFileInput(fName);
            byte [] txt = new byte[100];
            inf.read(txt);
            inf.close();
            diaryStr = (new String(txt)).trim();
            btnSave.setText("수정하기");
        }catch(IOException e){
            editDiary.setHint("일기가 없습니다.");
            btnSave.setText("새로 저장하기");
        }
        return diaryStr;
    }
}
