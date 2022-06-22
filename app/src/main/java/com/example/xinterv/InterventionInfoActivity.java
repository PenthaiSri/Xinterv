package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class InterventionInfoActivity extends AppCompatActivity {

    TextView numero, date, type, duree, responsable, description;

    ImageButton bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intervention_info);

        //Elements de la partie graphique
        // Bouton
        bouton = (ImageButton) findViewById(R.id.imageButton);
        //TextViews
        numero = (TextView) findViewById(R.id.textNumero);
        date = (TextView) findViewById(R.id.textDate);
        type = (TextView) findViewById(R.id.textType);
        duree = (TextView) findViewById(R.id.textDuree);
        responsable = (TextView) findViewById(R.id.textResponsable);
        description = (TextView) findViewById(R.id.textDescription);

        // On récupère les valeurs des champs
        Intent intervInfo = getIntent();
        String numeroValue = intervInfo.getStringExtra(InterventionActivity.EXTRA_NUMERO);
        String dateValue = intervInfo.getStringExtra(InterventionActivity.EXTRA_DATE);
        String typeValue = intervInfo.getStringExtra(InterventionActivity.EXTRA_TYPE);
        String dureeValue = intervInfo.getStringExtra(InterventionActivity.EXTRA_DUREE);
        String responsableValue = intervInfo.getStringExtra(InterventionActivity.EXTRA_RESPONSABLE);
        String descValue = intervInfo.getStringExtra(InterventionActivity.EXTRA_DESC);

        // On envoie les données
        numero.setText(numeroValue);
        date.setText(dateValue);
        type.setText(typeValue);
        duree.setText(dureeValue);
        responsable.setText(responsableValue);
        description.setText(descValue);

        // Si le bouton retour est cliqué
        bouton.setOnClickListener(new View.OnClickListener(){
            // On envoi sur la page principale
            public void onClick(View viewMenu) {
                Intent viewMenuPage = new Intent(InterventionInfoActivity.this, MenuActivity.class);
                startActivity(viewMenuPage);
            }
        });
    }
}