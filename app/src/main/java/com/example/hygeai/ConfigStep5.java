package com.example.hygeai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfigStep5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_step5);
    }
    public void goToMenu(View v){
        Intent menu = new Intent(this,Menu.class);
        startActivity(menu);
    }
}
