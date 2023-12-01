package com.example.hw_6_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvWelcome, tvRegister,tvEnter;
    private EditText etEmail,etPassword;
    private Button btnEnter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvWelcome = findViewById(R.id.tv_welcome);
        tvEnter = findViewById(R.id.btn_enter);
        tvRegister = findViewById(R.id.tv_register);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        btnEnter = findViewById(R.id.btn_enter);

        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (etPassword.getText().toString().isEmpty()){
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }


        });
        etEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (etEmail.getText().toString().isEmpty()){
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

        });
        btnEnter.setOnClickListener(v -> {
            if (etEmail.getText().toString().equals("admin") && etPassword.getText().toString().equals("admin")){
                tvRegister.setVisibility(View.GONE);
                tvEnter.setVisibility(View.GONE);
                etPassword.setVisibility(View.GONE);
                etEmail.setVisibility(View.GONE);
                btnEnter.setVisibility(View.GONE);
                Toast.makeText(this, "Вы успешно зарегистрировались !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}