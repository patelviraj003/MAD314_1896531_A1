package com.example.mad314_1896531_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculation extends AppCompatActivity {
TextView sumOfNumbers, multiplicationOfNumbers;
Button goTofirstPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
        sumOfNumbers = (TextView)findViewById(R.id.txtdisplaySum);
         multiplicationOfNumbers= (TextView)findViewById(R.id.txtdisplayMultiply);
         goTofirstPage = (Button)findViewById(R.id.btnFirstPage);

        Intent i =getIntent();
         int num1 = i.getIntExtra("number1",0);
         int num2 = i.getIntExtra("number2",0);
         int num3 = i.getIntExtra("number3",0);
        sumOfNumbers.setText("sum of 3 numbers: " + (num1+num2+num3));
       multiplicationOfNumbers.setText("Multiplication of 3 numbers: " + num1*num2*num3);

         goTofirstPage.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
               Intent i = new Intent(getApplicationContext(),MainActivity.class);
               startActivity(i);
             }
         });

    }
}
