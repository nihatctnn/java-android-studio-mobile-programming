package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassActivity extends AppCompatActivity {

    Button btnMassCalculator;
    EditText etHeight, etWeight;
    TextView tvMass, tvMassInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        btnMassCalculator = findViewById(R.id.btn_MassCalculator);
        etWeight = findViewById(R.id.et_Weight);
        etHeight = findViewById(R.id.et_Height);
        tvMass = findViewById(R.id.tv_mass);
        tvMassInfo = findViewById(R.id.tv_mass_info);

        btnMassCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double height = Double.parseDouble(etHeight.getText().toString());
                Double weight = Double.parseDouble(etWeight.getText().toString());
                Double massIndex = weight/Math.pow(height, 2);

                tvMass.setText("Your mass index is : " + massIndex);

                if (massIndex>25)
                    tvMassInfo.setText("Obes");
                else if (massIndex > 20 && massIndex<25)
                    tvMassInfo.setText("Normal");
                else if (massIndex < 20)
                    tvMassInfo.setText("Abnormal");
                else
                    tvMassInfo.setText("Error ! Check your informations !");
            }
        });
    }
}