package com.example.jatetxea;

import androidx.annotation.NonNull;

class Platera {
    String izena, deskribapena;
    int prezioa;

    Platera(String izena, String deskribapena, int prezioa) {
        this.izena = izena;
        this.deskribapena = deskribapena;
        this.prezioa = prezioa;
    }

    @NonNull
    @Override
    public String toString() {
        return izena;
    }
}