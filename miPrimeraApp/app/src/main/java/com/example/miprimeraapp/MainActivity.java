package com.example.miprimeraapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tempVal;
    Button btn;
    RadioButton opt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(v->calcular());
    }
    private void calcular(){
        tempVal = findViewById(R.id.txtNum1);
        double num1 =  Double.parseDouble(tempVal.getText().toString());

        tempVal = findViewById(R.id.txtNum2);
        double num2 = Double.parseDouble(tempVal.getText().toString());

        double respuesta = 0;


        opt = findViewById(R.id.optSuma);
        if(opt.isChecked()) {
            respuesta = num1 + num2;
        }
        opt = findViewById(R.id.optResta);
        if(opt.isChecked()){
            respuesta = num1 - num2;
        }
        opt = findViewById(R.id.optMultiplicar);
        if(opt.isChecked()){
            respuesta = num1 * num2;
        }
        opt = findViewById(R.id.optDividir);
        if(opt.isChecked()){
            respuesta = num1 / num2;
        }
        // FACTORIAL
        opt = findViewById(R.id.optFactorial);
        if (opt.isChecked()){

            double facto = 1;

            for (int i = 1; i <= num1; i++) {
                facto = facto * i;
            }

            respuesta = facto;
        }

        // PORCENTAJE
        opt = findViewById(R.id.optPorcentaje);
        if (opt.isChecked()){
            respuesta = (num1 * num2)/ 100;
        }

        // Exponenciacion
        opt = findViewById(R.id.optExponenciacion);
        if (opt.isChecked()){
            respuesta = Math.pow(num1,num2);

        }

        // RAIZ
        opt = findViewById(R.id.optExponenciacion);
        if (opt.isChecked()){
            num2 = 0;
            respuesta = Math.sqrt(num1);

        }

        tempVal = findViewById(R.id.lblRespuesta);
        tempVal.setText("Respuesta: "+ respuesta);
    }
}