package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class RelativeLayout extends AppCompatActivity {
    Button closeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        closeBtn = findViewById(R.id.close);

        onCloseBtnClick();
    }

    private void onCloseBtnClick() {
        closeBtn.setOnClickListener(v ->{
            Intent intentClose = new Intent(this, MainActivity.class);
            startActivity(intentClose);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Objects.requireNonNull(getSupportActionBar()).setTitle("Hello Relative Layout");
    }
}