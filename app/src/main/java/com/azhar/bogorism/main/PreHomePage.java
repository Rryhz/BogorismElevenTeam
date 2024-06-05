package com.azhar.bogorism.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.azhar.bogorism.R;
import com.azhar.bogorism.login.LoginActivity;
import com.azhar.bogorism.register.RegisterActivity;

public class PreHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.azhar.bogorism.R.layout.activity_pre_home_page);

        Button explore_button = findViewById(R.id.explore_button);
        explore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreHomePage.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}