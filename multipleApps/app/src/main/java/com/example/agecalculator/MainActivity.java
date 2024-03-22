package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalc, btnAge, btnMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalc = findViewById(R.id.btn_calculator);
        btnAge = findViewById(R.id.btn_age);
        btnMass = findViewById(R.id.btn_mass);

        btnMass.setOnClickListener(this);
        btnAge.setOnClickListener(this);
        btnCalc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int Id = view.getId();
        Intent i;

        if (Id == R.id.btn_calculator) {
            i = new Intent(MainActivity.this, CalculatorActivity.class);
            startActivity(i);
        } else if (Id == R.id.btn_age) {
            i = new Intent(MainActivity.this, AgeActivity.class);
            startActivity(i);
        } else if (Id == R.id.btn_mass) {
            i = new Intent(MainActivity.this, MassActivity.class);
            startActivity(i);
        }
    }
}