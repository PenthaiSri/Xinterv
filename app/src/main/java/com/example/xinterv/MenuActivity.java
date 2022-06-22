package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    Button buttonSetCar, buttonSetInterv, buttonSetOwner;

    ImageButton boutonQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // elements de l'interface graphique
        // Boutons
        buttonSetCar = (Button)findViewById(R.id.buttonSetCar);
        buttonSetInterv = (Button)findViewById(R.id.buttonSetInterv);
        buttonSetOwner = (Button)findViewById(R.id.buttonSetOwner);
        // ImageButton
        boutonQuit = (ImageButton) findViewById(R.id.imageButton4);

        // Lorsque le bouton saisie des véhicules est cliqué
        buttonSetCar.setOnClickListener(new View.OnClickListener() {
            @Override
            // On envoie sur la page d'ajout des véhicules
            public void onClick(View viewSetCar) {
                Intent setCarActivity = new Intent(MenuActivity.this, AddCarActivity.class);
                startActivity(setCarActivity);
            }
        });

        // Lorsque le bouton saisie des interventions est cliqué
        buttonSetInterv.setOnClickListener(new View.OnClickListener(){
            @Override
            // On envoie sur la page d'ajout des interventions
            public void onClick(View viewSetInterv) {
                Intent setIntervActivity = new Intent(MenuActivity.this, InterventionActivity.class);
                startActivity(setIntervActivity);
            }
        });

        // Lorsque le bouton saisie des propriétaire est cliqué
        buttonSetOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            // On envoie sur la page d'ajout des propriétaires
            public void onClick(View viewSetOwner) {
                Intent setOwnerActivity = new Intent(MenuActivity.this, AddOwnerActivity.class);
                startActivity(setOwnerActivity);
            }
        });

        // Si le bouton quitter est cliqué
        boutonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                finish();
            }
        });
    }
}
