package com.example.day0514;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    Button btnAdd;
    EditText editItem;
    ListView list2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("두 번째");

        btnAdd = findViewById(R.id.btnAdd);
        editItem = findViewById(R.id.edtItem);
        list2 = findViewById(R.id.list2);


        ArrayList<String> midlist = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, midlist);

        list2.setAdapter(adapter);
        list2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                midlist.remove(i); //삭제
                adapter.notifyDataSetChanged(); //화면에 보이기
                return false;
            }
        });
        
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                midlist.add(editItem.getText().toString()); //추가
                adapter.notifyDataSetChanged(); //추가된 항목 보이기
            }
        });
    }
}