package com.azhar.bogorism.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.azhar.bogorism.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout Wisata1 = findViewById(com.azhar.bogorism.R.id.Wisata1);
        Wisata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinasiActivity_1.class);
                startActivity(intent);
            }
        });

        LinearLayout Wisata2= findViewById(com.azhar.bogorism.R.id.Wisata2);
        Wisata2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinasiActivity_2.class);
                startActivity(intent);
            }
        });

        LinearLayout Wisata3= findViewById(com.azhar.bogorism.R.id.Wisata3);
        Wisata3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinasiActivity_3.class);
                startActivity(intent);
            }
        });

        LinearLayout Wisata4= findViewById(com.azhar.bogorism.R.id.Wisata4);
        Wisata4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinasiActivity_4.class);
                startActivity(intent);
            }
        });

        LinearLayout Wisata5= findViewById(com.azhar.bogorism.R.id.Wisata5);
        Wisata5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinasiActivity_5.class);
                startActivity(intent);
            }
        });

        LinearLayout Wisata6= findViewById(com.azhar.bogorism.R.id.Wisata6);
        Wisata6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DestinasiActivity_6.class);
                startActivity(intent);
            }
        });
    }
}