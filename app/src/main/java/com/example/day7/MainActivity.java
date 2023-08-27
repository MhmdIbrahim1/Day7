package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView goToTask2;
    TextView redTv;
    TextView greenTv;
    TextView blueTv;
    TextView yellowTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToTask2 = findViewById(R.id.nextTask);
        redTv  = findViewById(R.id.redView);
        greenTv  = findViewById(R.id.greenView);
        blueTv  = findViewById(R.id.blueView);
        yellowTv  = findViewById(R.id.yellowView);


        onGoToTask2Click();

    }

    private void onGoToTask2Click(){
        goToTask2.setOnClickListener(v -> {
            Intent intent = new Intent(this, RelativeLayout.class);
            startActivity(intent);
        });
    }

}