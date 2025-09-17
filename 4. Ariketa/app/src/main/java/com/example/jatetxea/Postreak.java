package com.example.jatetxea;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Postreak extends AppCompatActivity {

    ListView postreakList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postreak);

        postreakList = findViewById(R.id.postreak);

        Platera[] platerak = {
                new Platera("Postrea 1","Postrea 1 deskribapena",5),
                new Platera("Postrea 2","Postrea 2 deskribapena",5),
                new Platera("Postrea 3","Postrea 3 deskribapena",5),
                new Platera("Postrea 4","Postrea 4 deskribapena",5),
                new Platera("Postrea 5","Postrea 5 deskribapena",5)
        };

        postreakList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, platerak));
    }
}