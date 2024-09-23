package com.example.day0507_a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class ImageActivity extends AppCompatActivity {

    final static int LINE = 1, CIRCLE=2, RECT=3, COLOR=4;
    static  int curShape = LINE, curColor = Color.BLUE ;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyPaintView(this));
        setTitle("간단 그림판");
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu; //메뉴 만들기
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"선 그리기");
        menu.add(0,2,0,"원 그리기");
        menu.add(0,3,0,"사각형 그리기");
        menu.add(0,4,0,"색변경: 빨간색");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {  //메뉴를 선택
        switch (item.getItemId()) {
            case 1:
                curShape = LINE; return true;
            case 2:
                curShape = CIRCLE; return true;
            case 3:
                curShape = RECT; return true;
            case 4:
                curColor = Color.RED; return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private static class MyPaintView extends View {
        int startX = -1, startY = -1, stopX = -1, stopY = -1;
        public MyPaintView(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            switch (event.getAction())
            {
                case MotionEvent.ACTION_DOWN:   //손가락으로 화면을 누르기 시작했을 때
                    startX = (int)event.getX();
                    startY = (int)event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:  //손가락으로 터치 후 움직였을 때
                case MotionEvent.ACTION_UP: //손가락을 화면에서 땔때
                    stopX = (int)event.getX();
                    stopY = (int)event.getX();
                    this.invalidate(); //그리기
                    break;
            }
            return true;
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setStrokeWidth(5);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(Color.RED);
            switch (curShape)
            {
                case LINE:
                    canvas.drawLine(startX, startY, stopX, stopY, paint);
                    break;
                case CIRCLE:
                    int radius = (int)Math.sqrt(Math.pow(stopX-startX,2)+Math.pow(stopY-startY,2));
                    canvas.drawCircle(startX, startY, radius,paint);
                    break;
                case RECT:
                    canvas.drawRect(startX, startY, stopX, stopY, paint);
                    break;
            }
        }
    }
}