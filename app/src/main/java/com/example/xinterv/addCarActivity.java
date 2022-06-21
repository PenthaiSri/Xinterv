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
                startActivity(viewCarInfo);
            }
        });
    }
}