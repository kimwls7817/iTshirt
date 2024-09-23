package com.example.day0326_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button landturtle, waterturtle, oceanturtle;

    final int F1=1, F2=2, F3=3;

    Button animal[] = new Button[3];
    int [] ani = {R.id.landturtle, R.id.waterturtle, R.id.oceanturtle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        landturtle = findViewById(R.id.landturtle);
//        waterturtle = findViewById(R.id.waterturtle);
//        oceanturtle = findViewById(R.id.oceanturtle);

        for(int i=0; i< animal.length; i++)
            animal[i] = findViewById(ani[i]);

        for(int i=0; i< animal.length; i++) {
            animal[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v==animal[0]) //육지거북이
                        fragmentView(F1);
                    else if (v==animal[1]) //민물거북이
                        fragmentView(F2);
                    else if (v==animal[2]) //바다거북이
                        fragmentView(F3);
                }
            });
        }

//        landturtle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                fragmentView(F1);
//            }
//        });
//
//        waterturtle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                fragmentView(F2);
//            }
//        });
//
//        oceanturtle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                fragmentView(F3);
//            }
//        });
    }

    private void fragmentView(int flag) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (flag)
        {
            case 1:
                landturtle lt = new landturtle();
                transaction.replace(R.id.data, lt);
                transaction.commit();
                break;
            case 2:
                waterturtle wt = new waterturtle();
                transaction.replace(R.id.data, wt);
                transaction.commit();
                break;
            case 3:
                oceanturtle ot = new oceanturtle();
                transaction.replace(R.id.data, ot);
                transaction.commit();
                break;
        }
    }

}