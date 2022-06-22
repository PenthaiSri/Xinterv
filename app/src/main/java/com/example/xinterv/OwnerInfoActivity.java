package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class OwnerInfoActivity extends AppCompatActivity {

    TextView nom, prenom, telephone, adresse;

    ImageButton bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_info);

        // elements de la partie graphique
        // TextView
        nom = (TextView) findViewById(R.id.textNom);
        prenom = (TextView) findViewById(R.id.textPrenom);
        telephone = (TextView) findViewById(R.id.textTel);
        adresse = (TextView) findViewById(R.id.textAdresse);

        // Boutons
        bouton = (ImageButton) findViewById(R.id.imageButton);

        // On récupère les valeurs des champs
        Intent ownerInfo = getIntent();
        String nomValue = ownerInfo.getStringExtra(AddOwnerActivity.EXTRA_NOM);
        String prenomValue = ownerInfo.getStringExtra(AddOwnerActivity.EXTRA_PRENOM);
        String telephoneValue = ownerInfo.getStringExtra(AddOwnerActivity.EXTRA_TELEPHONE);
        String adresseValue = ownerInfo.getStringExtra(AddOwnerActivity.EXTRA_ADRESSE);

        // On envoie les valuers
        nom.setText(nomValue);
        prenom.setText(prenomValue);
        telephone.setText(telephoneValue);
        adresse.setText(adresseValue);

        // Si le bouton retour est cliqué
        bouton.setOnClickListener(new View.OnClickListener(){
            // On envoi sur la page principale
            public void onClick(View viewMenu) {
                Intent viewMenuPage = new Intent(OwnerInfoActivity.this, MenuActivity.class);
                startActivity(viewMenuPage);
            }
        });
    }
}