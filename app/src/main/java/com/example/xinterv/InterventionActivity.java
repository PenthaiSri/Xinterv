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

    Button infos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intervention);

        // Elements de l'interface graphique
        // Boutons
        infos = (Button) findViewById(R.id.buttonInfo);
        // EditText
        editTextNumero = (EditText) findViewById(R.id.editTextNumero);
        editTextDate = (EditText) findViewById(R.id.editTextDate);
        editTextType = (EditText) findViewById(R.id.editTextType);
        editTextDuree = (EditText) findViewById(R.id.editTextDuree);
        editTextResponsable = (EditText) findViewById(R.id.editTextResponsable);
        editTextDesc = (EditText) findViewById(R.id.editTextDesc);

        // Si le bouton info est cliqué
        infos.setOnClickListener(new View.OnClickListener(){
            @Override
            // On envoie sur la page d'infos
            public void onClick(View viewInfo){
                Intent viewIntervInfo = new Intent(InterventionActivity.this, InterventionInfoActivity.class);

                String numeroValue = editTextNumero.getText().toString();
                String dateValue = editTextDate.getText().toString();
                String typeValue = editTextType.getText().toString();
                String dureeValue = editTextDuree.getText().toString();
                String resposanbleValue = editTextResponsable.getText().toString();
                String descValue = editTextDesc.getText().toString();

                viewIntervInfo.putExtra(EXTRA_NUMERO, numeroValue);
                viewIntervInfo.putExtra(EXTRA_DATE, dateValue);
                viewIntervInfo.putExtra(EXTRA_TYPE, typeValue);
                viewIntervInfo.putExtra(EXTRA_DUREE, dureeValue);
                viewIntervInfo.putExtra(EXTRA_RESPONSABLE, resposanbleValue);
                viewIntervInfo.putExtra(EXTRA_DESC, descValue);

                startActivity(viewIntervInfo);
            }
        });
    }
}