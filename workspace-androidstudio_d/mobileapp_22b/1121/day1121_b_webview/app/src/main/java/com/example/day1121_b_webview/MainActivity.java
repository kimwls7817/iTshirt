package com.example.day1121_b_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUrl;
    Button btnGo, btnBack;
    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("인터넷사용창-김예진");
        edtUrl = findViewById(R.id.edtUrl);    // 왼쪽은 자바에서 선언한 전역변수, 오른쪽은 xml id임
        btnGo = findViewById(R.id.btnGo);
        btnBack = findViewById(R.id.btnBack);
        web = findViewById(R.id.webView1);

        web.setWebViewClient(new CookWebViewClient());
        WebSettings webset = web.getSettings();
        webset.setBuiltInZoomControls(true);   // 줌버튼 컨트롤이 화면에 보이게
        webset.setJavaScriptEnabled(true);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl(edtUrl.getText().toString());
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.goBack();
            }
        });
    }

    class CookWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}