package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class CalculatorActivity extends AppCompatActivity {

    EditText etFirstNumber, etSecondNumber;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etFirstNumber = findViewById(R.id.et_first_number);
        etSecondNumber = findViewById(R.id.et_second_number);

        btnAdd = findViewById(R.id.sum);
        btnSub = findViewById(R.id.sub);
        btnMul = findViewById(R.id.mul);
        btnDiv = findViewById(R.id.div);

        tvResult = findViewById(R.id.tv_result);
    }
    public void ButtonClick(View v){
        int ID = v.getId();
        String firstNumber = etFirstNumber.getText().toString();
        String secondNumber = etSecondNumber.getText().toString();

        if(!TextUtils.isEmpty(firstNumber) && !TextUtils.isEmpty(secondNumber)){
            double first = Double.parseDouble(firstNumber);
            double second = Double.parseDouble(secondNumber);
            double result = 0.0;

            if (ID == R.id.sum) {
                result = first + second;
            } else if (ID == R.id.sub) {
                result = first - second;
            } else if (ID == R.id.mul) {
                result = first * second;
            } else if (ID == R.id.div) {
                if (second !=0)
                    result = first / second;
                else
                    Toast.makeText(getApplicationContext(), "Divided by 0 error", Toast.LENGTH_SHORT).show();
            } else {
                // Handle the case where ID does not match any of the expected values
            }

            tvResult.setText("Result : " + result);
        } else
            Toast.makeText(getApplicationContext(), "You did not enter two numbers", Toast.LENGTH_SHORT).show();
    }
}