package com.example.day0514;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    ListView list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        setTitle("첫 번째");

        list1 = findViewById(R.id.list1);

        String [] mid = {"잉글리시브랙퍼스트티", "녹차", "홍차", "국화차",
                "허브차", "시나몬차", "얼그레이티", "레몬차", "딸기청", "사과청", "복숭아청",
                "키위청", "청귤청", "오렌지마말레이드", "레몬청", "귤청"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_multiple_choice, mid);
        list1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE); //다중 선택
        list1.setAdapter(adapter);
        
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), mid[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}