package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class addCarActivity extends AppCompatActivity {

    public static final String EXTRA_IMMATRICULATION = "com.example.xinterv.immatriculation";
    public static final String EXTRA_MARQUE = "com.example.xinterv.marque";
    public static final String EXTRA_MODELE = "com.example.xinterv.modele";
    public static final String EXTRA_COULEUR = "com.example.xinterv.couleur";
    public static final String EXTRA_PUISSANCE = "com.example.xinterv.puissance";
    public static final String EXTRA_CATEGORIE = "com.example.xinterv.categorie";
    public static final String EXTRA_BOITE = "com.example.xinterv.boite";
    public static final String EXTRA_ANNEE = "com.example.xinterv.annee";

    EditText editTextImmatriculation, editTextMarque, editTextModele, editTextCouleur, editTextPuissance,
            editTextCategorie, editTextBoite, editTextAnnee;

    Button buttonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        // Elements de l'interface graphique
        // Boutons
        buttonInfo = (Button) findViewById(R.id.buttonInfo);
        // EditText
        editTextImmatriculation = (EditText) findViewById(R.id.editTextImmatriculation);
        editTextMarque = (EditText) findViewById(R.id.editTextMarque);
        editTextModele = (EditText) findViewById(R.id.editTextModele);
        editTextCouleur = (EditText) findViewById(R.id.editTextCouleur);
        editTextPuissance = (EditText) findViewById(R.id.editTextPuissance);
        editTextCategorie = (EditText) findViewById(R.id.editTextCategorie);
        editTextBoite = (EditText) findViewById(R.id.editTextBoite);
        editTextAnnee = (EditText) findViewById(R.id.editTextDate);

        // Si le boutons infos est cliqué
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            // On envoie sur la page d'info
            public void onClick(View viewInfo) {
                Intent viewCarInfo = new Intent(addCarActivity.this, carInfoActivity.class);

                String immatriculationValue = editTextImmatriculation.getText().toString();
                String marqueValue = editTextMarque.getText().toString();
                String modeleValue = editTextModele.getText().toString();
                String couleurValue = editTextCouleur.getText().toString();
                String puissanceValue = editTextPuissance.getText().toString();
                String categorieValue = editTextCategorie.getText().toString();
                String boiteValue = editTextBoite.getText().toString();
                String anneeValue = editTextAnnee.getText().toString();

                viewCarInfo.putExtra(EXTRA_IMMATRICULATION, immatriculationValue);
                viewCarInfo.putExtra(EXTRA_MARQUE, marqueValue);
                viewCarInfo.putExtra(EXTRA_MODELE, modeleValue);
                viewCarInfo.putExtra(EXTRA_COULEUR, couleurValue);
                viewCarInfo.putExtra(EXTRA_PUISSANCE, puissanceValue);
                viewCarInfo.putExtra(EXTRA_CATEGORIE, categorieValue);
                viewCarInfo.putExtra(EXTRA_BOITE, boiteValue);
                viewCarInfo.putExtra(EXTRA_ANNEE, anneeValue);

                startActivity(viewCarInfo);
            }
        });
    }
}