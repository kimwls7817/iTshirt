package com.example.report01_2024_2201681;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;

public class NewsActivity extends AppCompatActivity {

    LinearLayout screen;
    WebView web;
    Button naverNews, bbcNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        setTitle("오늘의 뉴스");

        screen = findViewById(R.id.screen);
        naverNews = findViewById(R.id.naverNews);
        bbcNews = findViewById(R.id.bbcNews);
        web = findViewById(R.id.webview);

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient());

        naverNews.setOnClickListener(v -> web.loadUrl("https://news.naver.com/"));
        bbcNews.setOnClickListener(v -> web.loadUrl("https://www.bbc.com/"));
    }
}