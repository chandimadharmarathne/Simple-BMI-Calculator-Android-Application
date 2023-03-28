package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {


    private TextView num1,num2,num3;
    private Float p,q,r;
    private String bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        num3 = findViewById(R.id.txt3);

        String numb1 = getIntent().getStringExtra("C1");


        p = Float.parseFloat(numb1.toString());
        bmi = Float.toString(p);

        num3.setText(numb1);
    }
}