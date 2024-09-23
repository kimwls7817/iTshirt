package com.example.report01_2024_2201681;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoneyActivity extends AppCompatActivity {

    Button change, usd, eur, jpy, cny, hh, fnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money);
        setTitle("오늘의 환율");

        change = findViewById(R.id.change);
        usd = findViewById(R.id.usd);
        eur = findViewById(R.id.eur);
        jpy = findViewById(R.id.jpy);
        cny = findViewById(R.id.cny);
        hh = findViewById(R.id.hh);
        fnc = findViewById(R.id.fnc);

        // 환율고시환율
        change.setOnClickListener(v -> {
            Intent intent = new Intent(MoneyActivity.this, ExchangeActivity.class);
            intent.putExtra("url", "https://finance.naver.com/marketindex/?tabSel=exchange#tab_section");
            startActivity(intent);
        });

        // 달러
        usd.setOnClickListener(v -> {
            Intent intent = new Intent(MoneyActivity.this, ExchangeActivity.class);
            intent.putExtra("url", "https://finance.naver.com/marketindex/exchangeDetail.naver?marketindexCd=FX_USDKRW");
            startActivity(intent);
        });

        // 유로
        eur.setOnClickListener(v -> {
            Intent intent = new Intent(MoneyActivity.this, ExchangeActivity.class);
            intent.putExtra("url", "https://finance.naver.com/marketindex/exchangeDetail.naver?marketindexCd=FX_EURKRW");
            startActivity(intent);
        });

        // 엔화
        jpy.setOnClickListener(v -> {
            Intent intent = new Intent(MoneyActivity.this, ExchangeActivity.class);
            intent.putExtra("url", "https://finance.naver.com/marketindex/exchangeDetail.naver?marketindexCd=FX_JPYKRW");
            startActivity(intent);
        });

        // 위안
        cny.setOnClickListener(v -> {
            Intent intent = new Intent(MoneyActivity.this, ExchangeActivity.class);
            intent.putExtra("url", "https://finance.naver.com/marketindex/exchangeDetail.naver?marketindexCd=FX_CNYKRW");
            startActivity(intent);
        });

        // 홍콩h
        hh.setOnClickListener(v -> {
            Intent intent = new Intent(MoneyActivity.this, ExchangeActivity.class);
            intent.putExtra("url", "https://finance.naver.com/world/sise.naver?symbol=HSI@HSCE&fdtc=0");
            startActivity(intent);
        });

        // 증권
        fnc.setOnClickListener(v -> {
            Intent intent = new Intent(MoneyActivity.this, ExchangeActivity.class);
            intent.putExtra("url", "https://finance.naver.com/");
            startActivity(intent);
        });

    }
}