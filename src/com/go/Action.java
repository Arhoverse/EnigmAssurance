package com.go;
public class Action extends Produit {
    private String entreprise;
    private double dividende;

    public Action(String nom, double prix, int quantite, String entreprise, double dividende) {
        super(nom, prix, quantite);
        this.entreprise = entreprise;
        this.dividende = dividende;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public double getDividende() {
        return dividende;
    }

    public double calculerValeur() {
        return prix * quantite;
    }

    @Override
    public String toString() {
        return super.toString() + " - Entreprise : " + entreprise + " - Dividende : " + dividende + "%";
    }
}