package com.example.mad314_1896531_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText number1, number2, number3;
Button btncalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText)findViewById(R.id.etNumber1);
        number2 = (EditText)findViewById(R.id.etNumber2);
        number3 = (EditText)findViewById(R.id.etNumber3);
 btncalculate = (Button)findViewById(R.id.btnClick);

 btncalculate.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
        Integer n1 = (Integer.parseInt( number1.getText().toString()));
         Integer n2 = (Integer.parseInt( number2.getText().toString()));
         Integer n3 = (Integer.parseInt( number3.getText().toString()));

         Intent i = new Intent(getApplicationContext(),Calculation.class);
         i.putExtra("number1",  n1);
         i.putExtra("number2", n2);
         i.putExtra("number3", n3);
         startActivity(i);
     }
 });

    }
}
