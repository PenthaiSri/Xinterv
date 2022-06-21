package com.example.xinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AuthActivity extends AppCompatActivity {

    static String email = "admin@xinterv.fr";
    static String password = "motdepasse";
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
        // Lorsque que le bouton Connexion est cliqué
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // On récupère la valeur du champ email et mot de passe
                String emailField = editEmailText.getText().toString();
                String pwdField = editPwdText.getText().toString();
                // On vérifie les identifiants
                if (emailField == email && pwdField == password) {
                    message.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}