package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        getSupportActionBar().setTitle("뉴스/속보");
    }

    public void onClick9(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.qwe_move:
                intent.setData(Uri.parse("https://coinness.live/"));
                startActivity(intent);
                break;
        }
    }
    public void onClick11(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.asd_move:
                intent.setData(Uri.parse("https://www.coindeskkorea.com/"));
                startActivity(intent);
                break;
        }
    }
    public void onClick12(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.na_move:
                intent.setData(Uri.parse("https://channelswift.netlify.app/"));
                startActivity(intent);
                break;
        }
    }
    public void onClick13(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.go_move:
                intent.setData(Uri.parse("https://www.bloomberg.com/crypto?utm_medium=cpc_search&utm_campaign=NB_ENG_CRYPT_CRYPTOXXXXXXX_EVG_XXXX_XXX_COUSA_EN_EN_X_BLOM_GO_SE_XXX_XXXXXXXXXX&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45Z4-Vlyixybf7G9z3IESWhnKHHStLtNbrYqX16TH8reYon0Vw_rfp8aAvRXEALw_wcB&gclsrc=aw.ds"));
                startActivity(intent);
                break;
        }
    }
    public void onClick14(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.up_move:
                intent.setData(Uri.parse("https://www.binance.com/en/trade/BTC_BUSD?theme=dark&type=spot"));
                startActivity(intent);
                break;
        }
    }
    public void onClick15(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.co_move:
                intent.setData(Uri.parse("https://ftx.com/trade/BTC-PERP"));
                startActivity(intent);
                break;
        }
    }

}