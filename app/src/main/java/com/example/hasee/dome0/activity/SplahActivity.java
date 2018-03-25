package com.example.hasee.dome0.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.hasee.dome0.R;

/**
 * 闪屏页
 */
public class SplahActivity extends AppCompatActivity {
    protected Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplahActivity.this,MainActivity.class));
            }
        },2000);

    }
}
