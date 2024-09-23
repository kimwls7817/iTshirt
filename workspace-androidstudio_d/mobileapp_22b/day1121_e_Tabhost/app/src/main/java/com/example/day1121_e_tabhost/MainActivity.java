package com.example.day1121_e_tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.widget.TabHost;

@SuppressWarnings(value = "deprecation")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tab
    }
}