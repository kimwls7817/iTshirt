package com.example.day0326_internet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText url;
    Button btngo, btnback, dial;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://m.nate.com"));
                startActivity(intent);
            }
        });
        url = findViewById(R.id.edturl);
        btngo = findViewById(R.id.move);
        btnback = findViewById(R.id.pre);
        web = findViewById(R.id.web);
        dial = findViewById(R.id.dial);

        web.setWebViewClient(new WebViewTest()); // 생성된 클래스를 웹뷰에 대입
        WebSettings webset = web.getSettings(); // 클래스를 준비
        webset.setBuiltInZoomControls(true); // 줌버튼 컨트롤이 보이게
        webset.setJavaScriptEnabled(true); // 웹뷰에서 자바스크립트가 작동되게

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.loadUrl(url.getText().toString());
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.goBack(); // 뒤로 가기      web.goForword(); // 앞으로

            }
        });

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("인삿말");
                dlg.setMessage("안녕하세요. \n좋은 하루 되세용:)");
                dlg.setNegativeButton("취소", null);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "확인을 눌렀습니다!",
                                Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
                dlg.show();
            }
        });

    }


    class WebViewTest extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}