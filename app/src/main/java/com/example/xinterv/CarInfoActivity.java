package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import android.os.Bundle;

import com.example.xinterv.Classe.Vehicule;
import com.example.xinterv.Models.VehiculeModel;

public class CarInfoActivity extends AppCompatActivity {

    private Vehicule vehicule;
    private VehiculeModel vModel = null;

    TextView immatriculation, marque, modele, couleur, puissance, categorie, boite, annee;

    Button retour;

    ImageButton bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);

        // Partie graphique
        // Boutons
        bouton = (ImageButton) findViewById(R.id.imageButton2);
        retour = (Button) findViewById(R.id.buttonReturn);
        // TextView
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
        String immatriculationValue = carInfo.getStringExtra(AddCarActivity.EXTRA_IMMATRICULATION);
        String marqueValue = carInfo.getStringExtra(AddCarActivity.EXTRA_MARQUE);
        String modeleValue = carInfo.getStringExtra(AddCarActivity.EXTRA_MODELE);
        String couleurValue = carInfo.getStringExtra(AddCarActivity.EXTRA_COULEUR);
        String puissanceValue = carInfo.getStringExtra(AddCarActivity.EXTRA_PUISSANCE);
        String categorieValue = carInfo.getStringExtra(AddCarActivity.EXTRA_CATEGORIE);
        String boiteValue = carInfo.getStringExtra(AddCarActivity.EXTRA_BOITE);
        String anneeValue = carInfo.getStringExtra(AddCarActivity.EXTRA_ANNEE);

        // On envoie les données
        immatriculation.setText(immatriculationValue);
        marque.setText(marqueValue);
        modele.setText(modeleValue);
        couleur.setText(couleurValue);
        puissance.setText(puissanceValue);
        categorie.setText(categorieValue);
        boite.setText(boiteValue);
        annee.setText(anneeValue);

        // Si le bouton envoyer est cliqué
        bouton.setOnClickListener(new View.OnClickListener(){
            // On envoi sur la page principale
            public void onClick(View viewMenu) {
                Intent viewMenuPage = new Intent(CarInfoActivity.this, MenuActivity.class);
                startActivity(viewMenuPage);
            }
        });
        // Si le bouton retour est cliqué
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewInsertPage = new Intent(CarInfoActivity.this, AddCarActivity.class);
                startActivity(viewInsertPage);
            }
        });
    }
}