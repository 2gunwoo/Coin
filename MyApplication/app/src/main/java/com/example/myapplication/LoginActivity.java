package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("로그인");
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void OnClickHandler(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("UPDATE").setMessage("현재 개발 중 입니다.\n"+
                "업데이트 후 사용 가능합니다.");

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }

    private class Signup {
    }
}