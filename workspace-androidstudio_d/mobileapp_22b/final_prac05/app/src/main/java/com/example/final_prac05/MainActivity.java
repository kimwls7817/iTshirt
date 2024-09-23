package com.example.final_prac05;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baselayout;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("옵션 메뉴 - 배경색 바꾸기");

        baselayout = findViewById(R.id.baseLayout);
        btn1 = findViewById(R.id.btn1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(Menuitem item) {
        switch (item.getItemid()) {
            case R.id.itemRed:
                baselayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                baselayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                baselayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                btn1.setRotation(45);
                return true;
            case R.id.subSize:
                btn1.setScaleX(2);
                return true;
        }
        return false;
    }

    //자바 코드로만 구성한 옵션 메뉴
//    public boolean onCreateOptionsMenu(MenuItem menu) {
//        super.onCreateOptionsMenu(menu);
//
//        menu.add(0,1,0, "배겨액(빨강)");
//        menu.add(0,2,0, "배겨액(초록)");
//        menu.add(0,3,0, "배겨액(파랑)");
//
//        SubMenu sMenu = menu.addSubMenu("버튼 배경 >> ");
//        sMenu.add(0,4,0, "버튼 45도 회전");
//        sMenu.add(0,5,0, "버튼 2배 확대");
//
//        return true;
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(MenuItem item) {
//        switch (item.getItemid()) {
//            case 1:
//                baselayout.setBackgroundColor(Color.RED);
//                return true;
//            case 2:
//                baselayout.setBackgroundColor(Color.GREEN);
//                return true;
//            case 3:
//                baselayout.setBackgroundColor(Color.BLUE);
//                return true;
//            case 4:
//                btn1.setRotation(45);
//                return true;
//            case 5:
//                btn1.setScaleX(2);
//                return true;
//        }
//    }
}

