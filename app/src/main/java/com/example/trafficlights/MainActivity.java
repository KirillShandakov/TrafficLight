package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.color.ser);
    }
    public void green(View view) {
        getWindow().setBackgroundDrawableResource(R.color.green);
    }
    public void red(View view) {
        getWindow().setBackgroundDrawableResource(R.color.red);
    }
    public void yellow(View view) { getWindow().setBackgroundDrawableResource(R.color.yellow);
    }
}