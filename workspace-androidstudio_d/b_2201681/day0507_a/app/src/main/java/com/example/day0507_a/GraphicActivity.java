package com.example.day0507_a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class GraphicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.graphic);
        setContentView(new MyGraphicView(this));    //메모리 올리기
        setTitle("그래픽 창");
    }

    private static class MyGraphicView extends View {
        //생성자가 필요함.
        //생성자 : constructor : 마우스 오른쪽 단추를 눌러 generate
        public MyGraphicView(Context context) {
            super(context);
        }

        //메소드 : onDraw() : 마우스 오른쪽 단추를 눌러 generate : override method
        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            super.onDraw(canvas);

            Paint paint = new Paint();  //색,두께 등
            paint.setColor(Color.RED);  //색
            paint.setStrokeWidth(5);    //두께
            canvas.drawCircle(getWidth()/2, getHeight()/2, 100, paint);    //원

            paint.setColor(Color.MAGENTA);
            paint.setAntiAlias(true);   //매끄럽게
            canvas.drawLine(20, 20, 1060, 20, paint);   //가로선
            canvas.drawLine(20, 20, 20, 1800, paint);   //세로선1
            canvas.drawLine(1060, 20, 1060, 1800, paint);   //세로선2
            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(0);

            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.FILL);   //내부색 채우기
            Rect rect1 = new Rect(50,100,50+200,100+200);    //사각형
            canvas.drawRect(rect1, paint);

            RectF rect2 = new RectF(500,100,500+200,100+200);    //둥근사각형
            canvas.drawRoundRect(rect2, 40,40,paint);
            paint.setStrokeWidth(10);
            Path path1 = new Path();
            path1.moveTo(20,580);
            path1.lineTo(20+100,580+100);
            path1.lineTo(20+200,580);
            path1.lineTo(20+300,580+100);
            path1.lineTo(20+400,580);
            canvas.drawPath(path1, paint);

            paint.setColor(Color.BLUE);
            paint.setStrokeWidth(1);
            paint.setTextSize(60);
            canvas.drawText("안드로이드", 100, 780, paint);

        }
    }
}