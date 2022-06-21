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

public class AuthActivity extends AppCompatActivity {

    static String email = "admin";
    static String password = "admin";
    Button buttonConnect, buttonQuit;
    EditText editEmailText, editPwdText;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        // Elements de l'interface graphique
        // Boutons
        buttonConnect = (Button)findViewById(R.id.buttonConnect);
        buttonQuit = (Button)findViewById(R.id.buttonQuit);
        // edittext
        editEmailText = (EditText)findViewById(R.id.editTextTextEmailAddress);
        editPwdText = (EditText)findViewById(R.id.editTextTextPassword);
        // TextView
        message = (TextView)findViewById(R.id.textView4);

        // Lorsque que le bouton quitter est cliqué
        buttonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                finish();
            }
        });

        // Lorsque que le bouton Connexion est cliqué
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On récupère la valeur du champ email et mot de passe
                String emailField = editEmailText.getText().toString();
                String pwdField = editPwdText.getText().toString();
                // On vérifie les identifiants
                if (emailField.equals(email) && pwdField.equals(password)) {
                    message.setTextColor(Color.parseColor("#274A0D"));
                    message.setText("Connexion réussie !");
                    message.setVisibility(View.VISIBLE);

                    // Délai de 3 seconde avant de passer sur la prochaine activité
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent menuActivity = new Intent(AuthActivity.this, MenuActivity.class);
                            startActivity(menuActivity);
                        }
                    }, 3000);
                } else {
                    message.setTextColor(Color.parseColor("#E61111"));
                    message.setText("Connexion refusée !");
                    message.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}