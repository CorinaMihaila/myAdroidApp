package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Button buttonCron = (Button) findViewById(R.id.button3);
        buttonCron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCronomether();
            }
        });

        Button buttonTimer = (Button) findViewById(R.id.cdTimer);
        buttonTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCountDown();
            }
        });
    }

    public void openCronomether() {
        Intent intent = new Intent(this, ChronometerCounter.class);
        startActivity(intent);
    }

    public void openCountDown() {
        Intent intent = new Intent(this, Count_Down.class);
        startActivity(intent);
    }
}
