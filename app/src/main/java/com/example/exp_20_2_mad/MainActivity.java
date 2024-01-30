package com.example.exp_20_2_mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(){
        startService(new Intent(this, MyService.class));
    }

    public void stopService(){
        stopService(new Intent(this, MyService.class));
    }
}