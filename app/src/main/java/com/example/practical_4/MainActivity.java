package com.example.practical_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BtnCalculate = findViewById(R.id.BtnCalculate);
        BtnCalculate.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                //Code for your desired action
                EditText Num1 = findViewById(R.id.ETNum1);
                EditText Num2 = findViewById(R.id.ETNum2);
                TextView TVResult = findViewById(R.id.TVResult);
                Double Result = Double.parseDouble(Num1.getText().toString()) + Double.parseDouble(Num2.getText().toString());
                TVResult.setText(Double.toString(Result));
        }
        });
    }
}