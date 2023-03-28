package com.example.name;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView num1,num2,num3;
    private Integer a,b,c;
    private Float p,q,r,s;
    private String bmi;

    @Override








    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       // num1 = findViewById(R.id.txt1);
        //num2 = findViewById(R.id.txt2);
        //num3 = findViewById(R.id.txt3);

        String numb1 = getIntent().getStringExtra("CHANDIMA");
        String numb2 = getIntent().getStringExtra("ISHAN");
        String numb3 = getIntent().getStringExtra("DHA");

       /* a = Integer.parseInt(numb1.toString());
        b = Integer.parseInt(numb2.toString());
        c = a*b;
        bmi = Integer.toString(c);*/

        p = Float.parseFloat(numb1.toString());
        q = Float.parseFloat(numb2.toString());
        r = q/(p*p/10000);
        bmi = Float.toString(r);
        s = Float.parseFloat(numb3.toString());


        //num1.setText(numb1);
        //num2.setText(numb2);

       //num3.setText(bmi);

       if(s>=18) {
           if (r <= 16.0) {
               Intent ia = new Intent(MainActivity2.this, MainActivity3.class);
               ia.putExtra("C1", bmi);
               startActivity(ia);

           } else if (r <= 17.0) {

               Intent ib = new Intent(MainActivity2.this, MainActivity4.class);
               ib.putExtra("C2", bmi);
               startActivity(ib);
           } else if (r <= 18.5) {

               Intent ic = new Intent(MainActivity2.this, MainActivity5.class);
               ic.putExtra("C3", bmi);
               startActivity(ic);
           } else if (r <= 25.0) {

               Intent id = new Intent(MainActivity2.this, MainActivity6.class);
               id.putExtra("C4", bmi);
               startActivity(id);
           } else if (r <= 30.0) {

               Intent ie = new Intent(MainActivity2.this, MainActivity7.class);
               ie.putExtra("C5", bmi);
               startActivity(ie);
           } else if (r <= 35.0) {

               Intent ig = new Intent(MainActivity2.this, MainActivity8.class);
               ig.putExtra("C6", bmi);
               startActivity(ig);
           } else if (r <= 40.0) {

               Intent ih = new Intent(MainActivity2.this, MainActivity9.class);
               ih.putExtra("C7", bmi);
               startActivity(ih);
           } else if (r > 40.0) {

               Intent ij = new Intent(MainActivity2.this, MainActivity10.class);
               ij.putExtra("C8", bmi);
               startActivity(ij);
           }
       }
       else{
           showAlertDialog();
       }



    }

    private void showAlertDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Please Enter age 18 or above person's data");
        alertDialogBuilder.setTitle("This calculation valid for age 18 or above person.");
        alertDialogBuilder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity2.this,"Clicked Ok",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }


}