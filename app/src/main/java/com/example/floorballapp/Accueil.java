package com.example.floorballapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Accueil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        TextView nom = findViewById(R.id.nom);
        TextView prenom = findViewById(R.id.prenom);
        TextView age = findViewById(R.id.prenom);
        ImageView identite = findViewById(R.id.photo_identite);
        //TODO : Gérer problème affichage image
        TextView simple = findViewById(R.id.simple);

        identite.findViewById(R.id.logo_floorball);
    }
}