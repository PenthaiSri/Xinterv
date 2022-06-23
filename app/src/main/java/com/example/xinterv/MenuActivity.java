package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.List;

public class MenuActivity extends AppCompatActivity {

    Button buttonSetCar, buttonSetInterv, buttonSetOwner, buttonGetCar, buttonGetInterv, buttonGetOwner;

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
        buttonGetCar = (Button) findViewById(R.id.buttonGetCar);
        buttonGetInterv = (Button) findViewById(R.id.buttonGetInterv);
        buttonGetOwner = (Button) findViewById(R.id.buttonGetOwner);
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

        // Lorsque le bouton liste des véhicules est cliqué
        buttonGetCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewGetCar) {
                Intent getCarActivity = new Intent(MenuActivity.this, ListCarActivity.class);
                startActivity(getCarActivity);
            }
        });

        // Lorsque le bouton liste des inteventions est cliqué
        buttonGetInterv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewGetInterv) {
                Intent getIntervActivity = new Intent(MenuActivity.this, ListIntervActivity.class);
                startActivity(getIntervActivity);
            }
        });

        // Lorsque le bouton liste des propriétaires est cliqué
        buttonGetOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewGetOwner) {
                Intent getOwnerActivity = new Intent(MenuActivity.this, ListOwnerActivity.class);
                startActivity(getOwnerActivity);
            }
        });

        // Si le bouton quitter est cliqué
        boutonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            // On ferme toutes les activités
            public void onClick(View view2) {
                Intent intent = new Intent(getApplicationContext(), AuthActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
