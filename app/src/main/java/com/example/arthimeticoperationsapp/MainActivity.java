package com.example.arthimeticoperationsapp;

import androidx.appcompat.app.AppCompatActivity;

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
String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e_val1=findViewById(R.id.val1);
        e_val2=findViewById(R.id.val2);
        t_result=findViewById(R.id.result);

    }

}