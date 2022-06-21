package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        // On récupère les valeurs des champs
        Intent carInfo = getIntent();
        String immatriculationValue = carInfo.getStringExtra(addCarActivity.EXTRA_IMMATRICULATION);
        String marqueValue = carInfo.getStringExtra(addCarActivity.EXTRA_MARQUE);
        String modeleValue = carInfo.getStringExtra(addCarActivity.EXTRA_MODELE);
        String couleurValue = carInfo.getStringExtra(addCarActivity.EXTRA_COULEUR);
        String puissanceValue = carInfo.getStringExtra(addCarActivity.EXTRA_PUISSANCE);
        String categorieValue = carInfo.getStringExtra(addCarActivity.EXTRA_CATEGORIE);
        String boiteValue = carInfo.getStringExtra(addCarActivity.EXTRA_BOITE);
        String anneeValue = carInfo.getStringExtra(addCarActivity.EXTRA_ANNEE);

        // On envoie les données
        immatriculation.setText(immatriculationValue);
        marque.setText(marqueValue);
        modele.setText(modeleValue);
        couleur.setText(couleurValue);
        puissance.setText(puissanceValue);
        categorie.setText(categorieValue);
        boite.setText(boiteValue);
        annee.setText(anneeValue);
    }
}