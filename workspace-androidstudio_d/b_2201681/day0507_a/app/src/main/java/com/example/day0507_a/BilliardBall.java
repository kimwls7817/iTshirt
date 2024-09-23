package com.example.day0507_a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

import androidx.annotation.NonNull;

import kotlinx.coroutines.internal.ResizableAtomicArray;

public class BilliardBall extends View {

    private ShapeDrawable mDrawavle;
    int x = 50; //그래픽 초기 위치
    int y = 50;
    int width = 200; //공 크기
    int height = 200;

    int cx, cy;
    int dir_x = 1; //움직이는 방향
    int dir_y = 1;
    int dx = 10; //속도
    int dy = 20;

    int screen_width = Resources.getSystem().getDisplayMetrics().widthPixels;
    int screen_height = Resources.getSystem().getDisplayMetrics().heightPixels;


    public BilliardBall(Context context) {
        super(context);
        mDrawavle = new ShapeDrawable(new OvalShape()); //타원 그래픽 객체 생성
        mDrawavle.getPaint().setColor(Color.GREEN); //그래픽 객체 색 지정
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        cx = x + width/2; //그래픽 중심 좌표
        cy = y + height/2;

        if(cx <= width/2)
            dir_x = 1;
        else if(cx >= screen_width - width/2)
            dir_x = -1;

        if(cy <= height/2)
            dir_y = 1;
        else if(cy >= screen_height - height/2)
            dir_y = -1;

        x += dir_x * dx;
        y += dir_y * dy;

        canvas.drawColor(Color.YELLOW);
        mDrawavle.setBounds(x,y, x+width, y+height);
        mDrawavle.draw(canvas);
        invalidate();
    }
}
