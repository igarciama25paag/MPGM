package com.example.jatetxea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Jatetxea extends AppCompatActivity {

    TextView email;
    CardView lehenengoPlaterak, bigarrenPlaterak, postreak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jatetxea);

        email = findViewById(R.id.email);
        lehenengoPlaterak = findViewById(R.id.lehenengo_platerak_cardview);
        bigarrenPlaterak = findViewById(R.id.bigarren_platerak_cardview);
        postreak = findViewById(R.id.postreak_cardview);

        email.setOnClickListener(v -> {
            Intent emailToIntent = new Intent(Intent.ACTION_SENDTO);
            emailToIntent.setData(Uri.parse("mailto:" + email.getText()));
            startActivity(emailToIntent);
        });
        lehenengoPlaterak.setOnClickListener(v -> startActivity(new Intent(Jatetxea.this, LehenengoPlaterak.class)));
        bigarrenPlaterak.setOnClickListener(v -> startActivity(new Intent(Jatetxea.this, BigarrenPlaterak.class)));
        postreak.setOnClickListener(v -> startActivity(new Intent(Jatetxea.this, Postreak.class)));
    }
}