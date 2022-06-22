package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button buttonSetCar, buttonSetInterv, buttonSetOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // elements de l'interface graphique
        // Boutons
        buttonSetCar = (Button)findViewById(R.id.buttonSetCar);
        buttonSetInterv = (Button)findViewById(R.id.buttonSetInterv);
        buttonSetOwner = (Button)findViewById(R.id.buttonSetOwner);

        // Lorsque le bouton saisie des véhicules est cliqué
        buttonSetCar.setOnClickListener(new View.OnClickListener() {
            @Override
            // On envoie sur la page d'ajout des véhicules
            public void onClick(View viewSetCar) {
                Intent setCarActivity = new Intent(MenuActivity.this, AddCarActivity.class);
                startActivity(setCarActivity);
            }
        });
    }
}
