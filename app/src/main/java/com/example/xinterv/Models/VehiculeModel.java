package com.example.xinterv.Models;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;

import com.example.xinterv.Classe.Vehicule;
import com.example.xinterv.Helper.DataBaseHelper;

import java.util.ArrayList;
import java.util.List;

public class VehiculeModel {

    // Champ de la base de données
    private SQLiteDatabase garage = null;
    private DataBaseHelper dbHelper;
    private String[] allColumns = {
        DataBaseHelper.v_immat, DataBaseHelper.v_marque, DataBaseHelper.v_modele, DataBaseHelper.v_couleur,
            DataBaseHelper.v_puissance, DataBaseHelper.v_categorie, DataBaseHelper.v_boite, DataBaseHelper.v_annee
    };

    public VehiculeModel(Context context){
        dbHelper = new DataBaseHelper(context);
    }

    public VehiculeModel(View.OnClickListener onClickListener) {
    }

    public void open() throws SQLException {
            garage = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public SQLiteDatabase getGarage(){
        return garage;
    }

    public Vehicule createVehicule(String immatriculation, String marque, String modele, String couleur, String puissance,
                                   String categorie, String boite, String annee){
        ContentValues initialValues = new ContentValues();
        initialValues.put(DataBaseHelper.v_immat, immatriculation);
        initialValues.put(DataBaseHelper.v_marque, marque);
        initialValues.put(DataBaseHelper.v_modele, modele);
        initialValues.put(DataBaseHelper.v_couleur, couleur);
        initialValues.put(DataBaseHelper.v_puissance, puissance);
        initialValues.put(DataBaseHelper.v_categorie, categorie);
        initialValues.put(DataBaseHelper.v_boite, boite);
        initialValues.put(DataBaseHelper.v_annee, annee);

        long insertId = garage.insert(DataBaseHelper.TAB_NAME, null, initialValues);

        Cursor cursor = garage.query(DataBaseHelper.TAB_NAME, allColumns, null, null, null, null, null);
        cursor.moveToFirst();

        Vehicule newVehicule = cursorToVehicule(cursor);
        cursor.close();
        return newVehicule;
    }

    private Vehicule cursorToVehicule(Cursor cursor){
        Vehicule vehicule = new Vehicule();

        vehicule.setId(cursor.getInt(0));
        vehicule.setImmat(cursor.getString(1));
        vehicule.setMarque(cursor.getString(2));
        vehicule.setModele(cursor.getString(3));
        vehicule.setCouleur(cursor.getString(4));
        vehicule.setPuissance(cursor.getString(5));
        vehicule.setCategorie(cursor.getString(6));
        vehicule.setBoite(cursor.getString(7));
        vehicule.setAnnee(cursor.getString(8));

        return vehicule;
    }

    public List<Vehicule> getAllVehicules() {
        List<Vehicule> vehicules = new ArrayList<Vehicule>();

        Cursor cursor = garage.query(DataBaseHelper.TAB_NAME, allColumns, null, null, null, null, null);
        cursor.moveToFirst();

        while(!cursor.isAfterLast()) {
            Vehicule vehicule = cursorToVehicule(cursor);
            vehicules.add(vehicule);
        }
        cursor.close();
        return vehicules;
    }

    public boolean deleteAllVehicules(SQLiteDatabase db){
        int doneDeleted = 0;
        doneDeleted =  db.delete(DataBaseHelper.TAB_NAME, null, null);
        return doneDeleted > 0;
    }

    public Cursor fetchAllVehicules(SQLiteDatabase db){
        Cursor mCursor = db.rawQuery("SELECT marque, modele, couleur, immatriculation FROM "+DataBaseHelper.TAB_NAME, null);
        if(mCursor != null){
            mCursor.moveToFirst();
        }
        return mCursor;
    }

}
