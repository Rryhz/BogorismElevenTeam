package com.azhar.bogorism.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.azhar.bogorism.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.azhar.bogorism.R.layout.activity_splash_screen_page);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenPage.this, PreHomePage.class);
                startActivity(intent);
            }
        }, 2000);
    }
}