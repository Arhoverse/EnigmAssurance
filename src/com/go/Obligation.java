package com.go;

public class Obligation extends Produit {
    private int duree;
    private double tauxInteret;

    public Obligation(String nom, double prix, int quantite, int duree, double tauxInteret) {
        super(nom, prix, quantite);
        this.duree = duree;
        this.tauxInteret = tauxInteret;
    }

    public int getDuree() {
        return duree;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public double calculerValeur() {
        return prix * quantite;
    }

    @Override
    public String toString() {
        return super.toString() + " - Durée : " + duree + " ans - Taux d'intérêt : " + tauxInteret + "%";
    }
}