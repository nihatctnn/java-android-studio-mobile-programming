package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstNumber, etSecondNumber;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        int firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
        int secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
        int result = 0;

        if (ID == R.id.sum) {
            result = firstNumber + secondNumber;
        } else if (ID == R.id.sub) {
            result = firstNumber - secondNumber;
        } else if (ID == R.id.mul) {
            result = firstNumber * secondNumber;
        } else if (ID == R.id.div) {
            result = firstNumber / secondNumber;
        } else {
            // Handle the case where ID does not match any of the expected values
        }

        tvResult.setText("Result : " + result);
    }
}