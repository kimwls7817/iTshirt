package com.example.day1205_a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout base;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //인플레이션, - 메모리 올리기.
        setTitle("메뉴_김예진");

        base = findViewById(R.id.base);
        btn = findViewById(R.id.button);
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater m = getMenuInflater();  //인플레이션, - 메모리 올리기.
        m.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId())
        {
            case R.id.red:
                base.setBackgroundColor(Color.RED);
                return true;
            case R.id.green:
                base.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.blue:
                base.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.rotate:
                btn.setRotation(45);
                return true;
            case R.id.sizeup:
                btn.setScaleX(2);
                return true;
            case R.id.size:
                btn.setScaleX(1);
                btn.setRotation(0);
                return true;
        }
        return false;
    }
}