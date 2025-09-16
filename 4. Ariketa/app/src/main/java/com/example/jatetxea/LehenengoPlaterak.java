package com.example.jatetxea;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LehenengoPlaterak extends AppCompatActivity {

    ListView platerakList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lehenengo_platerak);

        platerakList = findViewById(R.id.lehenengo_platerak);

        Platera[] platerak = {
                new Platera("Platera 1","Platera 1 deskribapena",10),
                new Platera("Platera 2","Platera 2 deskribapena",10),
                new Platera("Platera 3","Platera 3 deskribapena",10),
                new Platera("Platera 4","Platera 4 deskribapena",10),
                new Platera("Platera 5","Platera 5 deskribapena",10),
                new Platera("Platera 6","Platera 6 deskribapena",10),
                new Platera("Platera 7","Platera 7 deskribapena",10),
                new Platera("Platera 8","Platera 8 deskribapena",10),
                new Platera("Platera 9","Platera 9 deskribapena",10),
                new Platera("Platera 10","Platera 10 deskribapena",10),
                new Platera("Platera 11","Platera 11 deskribapena",10),
                new Platera("Platera 12","Platera 12 deskribapena",10),
                new Platera("Platera 13","Platera 13 deskribapena",10),
                new Platera("Platera 14","Platera 14 deskribapena",10),
                new Platera("Platera 15","Platera 15 deskribapena",10),
                new Platera("Platera 16","Platera 16 deskribapena",10),
                new Platera("Platera 17","Platera 17 deskribapena",10),
                new Platera("Platera 18","Platera 18 deskribapena",10),
                new Platera("Platera 19","Platera 19 deskribapena",10),
                new Platera("Platera 20","Platera 20 deskribapena",10)
        };

        platerakList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, platerak));
    }
}