package com.example.appbirziklagarria;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.eskeleto_recycler_view);

        Element[] elements = {
                new Element("Deabruzko Eskeletua","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",R.drawable.esqueleto_diabolico),
                new Element("Eskeletu Maltzurra","Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",R.drawable.esqueleto_diabolico1),
                new Element("Gaiztoenetariko Eskeletua","Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",R.drawable.esqueleto_diabolico2),
                new Element("DIABLO! Eskeletua","Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",R.drawable.esqueleto_diabolico3),
                new Element("Eskeletua Freskua","Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.",R.drawable.esqueleto_diabolico4)
        };

        recyclerView.setAdapter(new ElementAdapter(elements));
    }
}