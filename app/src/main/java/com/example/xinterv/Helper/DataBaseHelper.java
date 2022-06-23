package com.example.xinterv.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final int VERSION = 1;
    public static final String DB_NAME = "garage";
    public static final String TAB_NAME = "voiture";
    public static final String v_id = "ID";
    public static final String v_immat = "immatriculation";
    public static final String v_marque = "marque";
    public static final String v_modele = "modele";
    public static final String v_couleur = "couleur";
    public static final String v_puissance = "puissance";
    public static final String v_categorie = "categorie";
    public static final String v_boite = "boite_vitesse";
    public static final String v_annee = "annee";

    private static final String CREATE_BDD = "CREATE TABLE " + TAB_NAME + "("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "immatriculation TEXT NOT NULL,"
            + "marque TEXT NOT NULL,"
            + "modele TEXT NOT NULL,"
            + "couleur TEXT NOT NULL,"
            + "puissance TEXT NOT NULL,"
            + "categorie TEXT NOT NULL,"
            + "boite_vitesse TEXT NOT NULL,"
            + "annee TEXT NOT NULL);";

    private Context mCtx = null;

    public DataBaseHelper(Context context){
        super(context, DB_NAME, null, VERSION);
        mCtx = null;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        Log.w("CREATE TABLE", CREATE_BDD);
        // Création de la table
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TAB_NAME);
        onCreate(db);
    }
}
