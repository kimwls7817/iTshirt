package com.example.day0409_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button add, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.et1);
        num2 = findViewById(R.id.et2);

        add = findViewById(R.id.add);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("Num1", Integer.parseInt(num1.getText().toString()));
        intent.putExtra("Num2", Integer.parseInt(num2.getText().toString()));

        startActivity(intent);
    }
}