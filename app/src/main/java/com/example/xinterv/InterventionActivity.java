package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class InterventionActivity extends AppCompatActivity {

    public static final String EXTRA_NUMERO = "com.example.xinterv.numero";
    public static final String EXTRA_DATE = "com.example.xinterv.date";
    public static final String EXTRA_TYPE = "com.example.xinterv.type";
    public static final String EXTRA_DUREE = "com.example.xinterv.duree";
    public static final String EXTRA_RESPONSABLE = "com.example.xinterv.responsable";
    public static final String EXTRA_DESC = "com.example.xinterv.desc";

    EditText editTextNumero, editTextDate, editTextType, editTextDuree, editTextResponsable, editTextDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intervention);

        // Elements de l'interface graphique
        // EditText
        editTextNumero = (EditText) findViewById(R.id.editTextNumero);
        editTextDate = (EditText) findViewById(R.id.editTextDate);
        editTextType = (EditText) findViewById(R.id.editTextType);
        editTextDuree = (EditText) findViewById(R.id.editTextDuree);
        editTextResponsable = (EditText) findViewById(R.id.editTextResponsable);
        editTextDesc = (EditText) findViewById(R.id.editTextDesc);

        // Si le bouton info est cliqué
    }
}