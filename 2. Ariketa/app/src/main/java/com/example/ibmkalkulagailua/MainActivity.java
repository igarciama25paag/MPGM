package com.example.ibmkalkulagailua;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    RadioButton gizona, emakumea;
    EditText adina, oinak, hazbeteak, pisua;
    Button kalkulatu;
    TextView textua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        elementuakBilatu();

        kalkulatu.setOnClickListener(v -> {
            try {
                double altuera = (Double.parseDouble(oinak.getText().toString()) * 12 + Double.parseDouble(hazbeteak.getText().toString())) * 0.0254;
                double bmi = Double.parseDouble(pisua.getText().toString()) / (altuera * altuera);
                bmi = (double) Math.round(bmi * 100) / 100;
                if(Integer.parseInt(adina.getText().toString()) >= 18) {
                    if (bmi < 18.5) {
                        textua.setText(bmi + " - Pisu gutxiegi duzu...");
                    } else if (bmi > 25) {
                        textua.setText(bmi + " - Pisu gehiegi duzu...");
                    } else {
                        textua.setText(bmi + " - Pisu egokia duzu!");
                    }
                } else {
                    if(gizona.isChecked()) {
                        textua.setText(bmi + " - 18 urte baino gutxiago dituzunez, kontsultatu zure medikuarekin mutilentzako osasun-tarteak.");
                    } else {
                        textua.setText(bmi + " - 18 urte baino gutxiago dituzunez, kontsultatu zure medikuarekin neskentzako osasun-tarteak.");
                    }
                }
            } catch (Exception e) {
                textua.setText("Errore bat egon da!");
            }
        });
    }

    private void elementuakBilatu() {
        gizona = findViewById(R.id.gizona);
        emakumea = findViewById(R.id.emakumea);

        adina = findViewById(R.id.adina);
        oinak = findViewById(R.id.oinak);
        hazbeteak = findViewById(R.id.hazbeteak);
        pisua = findViewById(R.id.pisua);

        kalkulatu = findViewById(R.id.kalkulatu);
        textua = findViewById(R.id.textua);
    }
}