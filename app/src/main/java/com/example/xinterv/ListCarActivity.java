package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ListCarActivity extends AppCompatActivity {

    TextView immatriculation;
    ImageButton bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_car);

        // Elements de la partie graphique
        // Boutons
        bouton = (ImageButton) findViewById(R.id.imageButton);
        // TextView
        immatriculation = (TextView) findViewById(R.id.tvImmat);


        // Si le bouton est cliqué
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewMenuPage = new Intent(ListCarActivity.this, MenuActivity.class);
                startActivity(viewMenuPage);
            }
        });
    }
}