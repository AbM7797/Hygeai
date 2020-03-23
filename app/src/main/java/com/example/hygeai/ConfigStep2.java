package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfigStep2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_step2);
    }
    public void goToStep3(View v){
        Intent step3 = new Intent(this,ConfigStep3.class);
        startActivity(step3);
    }
}
