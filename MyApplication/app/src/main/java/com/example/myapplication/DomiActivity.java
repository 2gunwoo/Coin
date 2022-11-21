package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DomiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domi);
        getSupportActionBar().setTitle("도미넌스");
    }

    public void onClick9(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.qwe_move:
                intent.setData(Uri.parse("https://kr.tradingview.com/symbols/CRYPTOCAP-BTC.D/"));
                startActivity(intent);
                break;
        }
    }
    public void onClick11(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.asd_move:
                intent.setData(Uri.parse("https://kr.tradingview.com/symbols/CRYPTOCAP-ETH.D/"));
                startActivity(intent);
                break;
        }
    }
    public void onClick12(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.na_move:
                intent.setData(Uri.parse("https://kr.tradingview.com/symbols/CRYPTOCAP-USDT.D/"));
                startActivity(intent);
                break;
        }
    }
    public void onClick13(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.go_move:
                intent.setData(Uri.parse("https://messari.io/asset/binance-usd/chart/mcap-dom"));
                startActivity(intent);
                break;
        }
    }
    public void onClick14(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.up_move:
                intent.setData(Uri.parse("https://upbit.com/exchange?code=CRIX.UPBIT.KRW-BTC"));
                startActivity(intent);
                break;
        }
    }
    public void onClick15(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.co_move:
                intent.setData(Uri.parse("https://coinone.co.kr/exchange/trade/btc/krw"));
                startActivity(intent);
                break;
        }
    }

}