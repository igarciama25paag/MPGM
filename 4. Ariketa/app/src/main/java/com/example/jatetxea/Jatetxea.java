package com.example.jatetxea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Jatetxea extends AppCompatActivity {

    CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jatetxea);

        card1 = findViewById(R.id.lehenengo_platerak_cardview);
        card2 = findViewById(R.id.bigarren_platerak_cardview);

        card1.setOnClickListener(v -> startActivity(new Intent(Jatetxea.this, LehenengoPlaterak.class)));
        card2.setOnClickListener(v -> startActivity(new Intent(Jatetxea.this, BigarrenPlaterak.class)));
    }
}