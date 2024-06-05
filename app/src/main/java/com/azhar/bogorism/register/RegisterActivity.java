package com.azhar.bogorism.register;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.azhar.bogorism.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText inputEmail, inputUser, inputPassword;
    private Button btnRegister, login_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inputEmail = findViewById(R.id.inputEmail);
        inputUser = findViewById(R.id.inputUser);
        inputPassword = findViewById(R.id.inputPassword);
        btnRegister = findViewById(R.id.btnRegister);
        login_masuk = findViewById(R.id.login_masuk);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString();
                String username = inputUser.getText().toString();
                String password = inputPassword.getText().toString();

                if (!username.isEmpty() && !password.isEmpty()) {
                    SharedPreferences preferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("username_" + username, username);
                    editor.putString("password_" + username, password);
                    editor.apply();

                    Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    finish(); // Close the RegisterActivity
                } else {
                    Toast.makeText(RegisterActivity.this, "Please enter a username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}