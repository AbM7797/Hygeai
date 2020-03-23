package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfigStep3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_step3);
    }
    public void goToStep4(View v){
        Intent step4 = new Intent(this,ConfigStep4.class);
        startActivity(step4);
    }
}
