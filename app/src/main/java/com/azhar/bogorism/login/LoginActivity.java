package com.azhar.bogorism.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.azhar.bogorism.R;
import com.azhar.bogorism.main.MainActivity;
import com.azhar.bogorism.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText inputUser, inputPassword;
    private Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputUser = findViewById(R.id.inputUser);
        inputPassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = inputUser.getText().toString();
                String password = inputPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                String registeredUsername = preferences.getString("username_" + username, null);
                String registeredPassword = preferences.getString("password_" + username, null);

                if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
                    // Save the logged-in user's username
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("loggedInUser", username);
                    editor.apply();

                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Close the LoginActivity
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}