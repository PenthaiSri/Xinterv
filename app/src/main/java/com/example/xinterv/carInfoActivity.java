package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;

import android.os.Bundle;

public class carInfoActivity extends AppCompatActivity {

    TextView immatriculation, marque, modele, couleur, puissance, categorie, boite, annee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);

        immatriculation = (TextView) findViewById(R.id.textImma);
        marque = (TextView) findViewById(R.id.textMarque);
        modele = (TextView) findViewById(R.id.textModele);
        couleur = (TextView) findViewById(R.id.textCouleur);
        puissance = (TextView) findViewById(R.id.textPuissance);
        categorie = (TextView) findViewById(R.id.textCategorie);
        boite = (TextView) findViewById(R.id.textBoite);
        annee = (TextView) findViewById(R.id.textAnnee);
    }
}