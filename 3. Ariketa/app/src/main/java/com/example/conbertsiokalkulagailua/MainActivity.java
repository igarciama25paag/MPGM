package com.example.conbertsiokalkulagailua;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText hazbeteak;
    Button kalkulatu;
    TextView emaitza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulagailua);

        hazbeteak = findViewById(R.id.hazbeteak);
        kalkulatu = findViewById(R.id.kalkulatu);
        emaitza = findViewById(R.id.emaitza);

        kalkulatu.setOnClickListener(v -> {
         try {
             emaitza.setText(Double.parseDouble(hazbeteak.getText().toString())*0.0254 + " metro");
         } catch (Exception e) {
             emaitza.setText("Errore bat egon da");
         }
        });
    }
}