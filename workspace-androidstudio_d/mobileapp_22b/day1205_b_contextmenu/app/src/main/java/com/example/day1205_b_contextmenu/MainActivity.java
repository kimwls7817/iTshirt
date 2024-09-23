package com.example.day1205_b_contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout base;
    Button btn1, btn2, btn3, btn4, btn5;
    ImageView image;
    EditText detid, edtpw;
    View dlgview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("컨택스트메뉴_김예진");

        base = findViewById(R.id.base);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);

        image = findViewById(R.id.image);

//        edtid = findViewById(R.id.edtid);
//        edtpw = findViewById(R.id.edtpw);

        registerForContextMenu(btn1);   //메뉴사용 위젯 등록
        registerForContextMenu(btn2);
        
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "토스트 연습", Toast.LENGTH_LONG).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목");
                dlg.setMessage("내용");
                dlg.setPositiveButton("닫기");
                dlg.show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dlgview = (View) View.inflate(MainActivity.this, R.layout.dialog1, null);   //메모리 올리기
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity);
                dlg.setView(dlgview);
                dlg.setMessage("내용");
                dlg.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        edtid = dlgview.findViewById(R.id.edtid);
                        edtpw = dlgview.findViewById(R.id.edtpw);
                    }
                }
                dlg.show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater x = getMenuInflater(); //메모리 올리기

        if(v == btn1){
            menu.setHeaderTitle("배경색 변경");
            x.inflate(R.menu.menu1, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onContextItemSelected(item);
        switch (item.getItemId()) {
            case R.id.red:
                base.setBackgroundColor(Color.RED);
                return true;
            case R.id.apple:
                image.setBackgroundColor(R.drawable.apple);
                return true;

        }
        return false;
    }
}