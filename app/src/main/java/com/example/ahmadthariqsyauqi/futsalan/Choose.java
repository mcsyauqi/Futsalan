package com.example.ahmadthariqsyauqi.futsalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void tampil_info(View v){
        Intent i=new Intent(Choose.this,MainActivity.class);
        startActivity(i);
    }

    public void tampil_score_board(View v){
        Intent i=new Intent(Choose.this,Score.class);
        startActivity(i);
    }
}
