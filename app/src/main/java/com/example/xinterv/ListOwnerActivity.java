package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListOwnerActivity extends AppCompatActivity {

    ImageButton bouton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_owner);

        // Elements de la partie graphique
        bouton = (ImageButton) findViewById(R.id.imageButton);

        // Si le bouton est cliqué
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewMenuPage = new Intent(ListOwnerActivity.this, MenuActivity.class);
                startActivity(viewMenuPage);
            }
        });
    }
}