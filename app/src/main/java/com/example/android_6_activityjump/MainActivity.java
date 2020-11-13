package com.example.android_6_activityjump;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void gojump2(View v) {
        Intent intent = new Intent(this, Activity_jump2.class);
        startActivity(intent);
    }
}