package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddOwnerActivity extends AppCompatActivity {

    public static final String EXTRA_NOM = "com.example.xinterv.nom";
    public static final String EXTRA_PRENOM = "com.example.xinterv.prenom";
    public static final String EXTRA_TELEPHONE = "com.example.xinterv.telephone";
    public static final String EXTRA_ADRESSE = "com.example.xinterv.adresse";

    EditText editTextNom, editTextPrenom, editTextTelephone, editTextAdresse;

    ImageButton bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_owner);

        // Elements de l'interface graphique
        // Boutons
        bouton = (ImageButton) findViewById(R.id.imageButton3);

        // EditText
        editTextNom = (EditText) findViewById(R.id.editTextNom);
        editTextPrenom = (EditText) findViewById(R.id.editTextPrenom);
        editTextTelephone = (EditText) findViewById(R.id.editTextTel);
        editTextAdresse = (EditText) findViewById(R.id.editTextAdresse);

        // Si le bouton info est cliqué
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewOwner) {
                Intent viewOwnerInfo = new Intent(AddOwnerActivity.this, OwnerInfoActivity.class);

                String nomValue = editTextNom.getText().toString();
                String prenomValue = editTextPrenom.getText().toString();
                String telephoneValue = editTextTelephone.getText().toString();
                String adresseValue = editTextAdresse.getText().toString();

                viewOwnerInfo.putExtra(EXTRA_NOM, nomValue);
                viewOwnerInfo.putExtra(EXTRA_PRENOM, prenomValue);
                viewOwnerInfo.putExtra(EXTRA_TELEPHONE, telephoneValue);
                viewOwnerInfo.putExtra(EXTRA_ADRESSE, adresseValue);

                startActivity(viewOwnerInfo);
            }
        });
    }
}