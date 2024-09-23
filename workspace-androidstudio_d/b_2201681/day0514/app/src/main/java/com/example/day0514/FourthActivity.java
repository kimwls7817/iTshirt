package com.example.day0514;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        setTitle("갤러리 음식 사진");
        Gallery gallery = findViewById(R.id.gallery1);
        MyGallery gall = new MyGallery(this);
        gallery.setAdapter(gall);
    }

    class MyGallery extends BaseAdapter{
        Context context;
        Integer [] posterID = {R.drawable.food01, R.drawable.food02, R.drawable.food03,
                R.drawable.food04,R.drawable.food05};
        public MyGallery(Context c) { // 생성자(클래스 이름과 동일)
            context = c; // 그리드뷰에 적용하기 위해 변수 선언
        }

        @Override
        public int getCount() { // 개수를 세기 위함
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200,300)); //크기
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER); //이미지뷰를 각 그리드 뷰의 중간
            imageView.setPadding(5,5,5,5); //간격조절
            imageView.setImageResource(posterID[position]);
            int pos = position;
            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView ivPoster = findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    return false;
                }
            });
            return imageView;
        }

    }
}