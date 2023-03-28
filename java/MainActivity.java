package com.example.name;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText hei,wei,ages;
    private Button add;

    @Override


    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to Exit?");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();



    }



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hei = findViewById(R.id.height);
        wei = findViewById(R.id.weight);
        add = findViewById(R.id.btngo);
        ages = findViewById(R.id.age);

        add.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View view) {
                String height1 = hei.getText().toString();
                String weight1 = wei.getText().toString();
                String age1 = ages.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("CHANDIMA",height1);
                intent.putExtra("ISHAN",weight1);
                intent.putExtra("DHA",age1);
                startActivity(intent);
            }
        });
    }
}