package com.example.xinterv.Classe;

import android.view.View;

import com.example.xinterv.CarInfoActivity;

public class Vehicule {

    public int id;
    public String immat, marque, modele, couleur, puissance, categorie, boite, annee;

    public Vehicule(View.OnClickListener onClickListener) { }

    public Vehicule(String immat, String marque, String modele, String couleur, String puissance,
                    String categorie, String boite, String annee) {
        this.immat = immat;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.categorie = categorie;
        this.boite = boite;
        this.annee = annee;
    }

    public Vehicule() {

    }


    // Getters
    public int getId() { return id; }
    public String getImmat() { return immat; }
    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public String getCouleur() { return couleur; }
    public String getPuissance() { return puissance; }
    public String getCategorie() { return categorie; }
    public String getBoite() { return  boite; }
    public String getAnnee() { return  annee; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setImmat(String immat) { this.immat = immat; }
    public void setMarque(String marque) { this.marque = marque; }
    public void setModele(String modele) { this.modele = modele; }
    public void setCouleur(String couleur) { this.couleur = couleur; }
    public void setPuissance(String puissance) { this.puissance = puissance; }
    public void setCategorie(String categorie) { this.categorie = categorie; }
    public void setBoite(String boite) { this.boite = boite; }
    public void setAnnee(String annee) { this.annee = annee; }

    // Methodes
    public String toString(){
        return "id : " + id
                + "immatriculation : " + immat
                + "marque : " + marque
                + "modele : " + modele
                + "couleur : " + couleur
                + "puissace : " + puissance
                + "categorie : " + categorie
                + "boite : " + boite
                + " annee : " + annee;
    }
}
