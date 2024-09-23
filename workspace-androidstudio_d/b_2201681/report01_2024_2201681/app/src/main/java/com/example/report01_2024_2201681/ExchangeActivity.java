package com.example.report01_2024_2201681;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ExchangeActivity extends AppCompatActivity {

    WebView moneyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exchange);

        moneyView = findViewById(R.id.moneyView);

        WebSettings webSettings = moneyView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        moneyView.setWebViewClient(new WebViewClient());

        String url = getIntent().getStringExtra("url");
        moneyView.loadUrl(url);
    }
}