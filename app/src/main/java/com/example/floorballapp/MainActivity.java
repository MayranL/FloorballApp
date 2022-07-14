package com.example.floorballapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logoFloorball = findViewById(R.id.logo_floorball);
        Intent intentAccueil = new Intent(this,Accueil.class);

        logoFloorball.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intentAccueil);
            }
        });

        final Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intentAccueil);
            }
        });
    }
}