package com.example.day0514;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        setTitle("GridView Food Picture");

        GridView gv = findViewById(R.id.gridView);
        MyGridAdapter ga = new MyGridAdapter(this);
        gv.setAdapter(ga);
    }
    class MyGridAdapter extends BaseAdapter{
        // 메소드 오버라이드
        Context context;
        Integer [] posterID = {R.drawable.food01, R.drawable.food02, R.drawable.food03,
                R.drawable.food04,R.drawable.food05};
        public MyGridAdapter(Context c) { // 생성자(클래스 이름과 동일)
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
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dlgView = View.inflate(ThirdActivity.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(ThirdActivity.this);
                    ImageView ivPoster = dlgView.findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("큰 사진");
                    dlg.setView(dlgView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });
            return imageView;
        }
    }
}