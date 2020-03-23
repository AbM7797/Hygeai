package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Configuration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
    }
    public void goToStep1(View v){
        Intent step1 = new Intent(this,ConfigStep1.class);
        startActivity(step1);
    }
}
