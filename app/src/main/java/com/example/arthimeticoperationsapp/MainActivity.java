package com.example.arthimeticoperationsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Button b_add,b_sub,b_mul,b_div;
EditText e_val1,e_val2;
TextView t_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e_val1=findViewById(R.id.val1);
        e_val2=findViewById(R.id.val2);
        t_result=findViewById(R.id.result);
    //    b_add = findViewById(R.id.add);

    }
   @SuppressLint("SetTextI18n")
   public void add(View view)
   {
       double val1 = Double.parseDouble(e_val1.getText().toString());
       double val2 = Double.parseDouble(e_val2.getText().toString());
       double sum = val1+val2;
       t_result.setText(Double.toString(sum));
   }

    @SuppressLint("SetTextI18n")
    public void sub(View view) {
        double val1 = Double.parseDouble(e_val1.getText().toString());
        double val2 = Double.parseDouble(e_val2.getText().toString());
        double sub = val1-val2;
        t_result.setText(Double.toString(sub));
    }

    public void mul(View view) {
        double val1 = Double.parseDouble(e_val1.getText().toString());
        double val2 = Double.parseDouble(e_val2.getText().toString());
        double mul = val1*val2;
        t_result.setText(Double.toString(mul));

    }

    public void div(View view) {
        double val1 = Double.parseDouble(e_val1.getText().toString());
        double val2 = Double.parseDouble(e_val2.getText().toString());
        double div = val1/val2;
        t_result.setText(Double.toString(div));
    }
}