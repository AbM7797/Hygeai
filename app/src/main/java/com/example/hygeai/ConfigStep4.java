package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfigStep4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_step4);
    }
    public void goToStep5(View v){
        Intent step5 = new Intent(this,ConfigStep5.class);
        startActivity(step5);
    }
}
