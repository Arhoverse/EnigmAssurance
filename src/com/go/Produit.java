package com.go;

public abstract class Produit {
    protected String nom;
    protected double prix;
    protected int quantite;

    public Produit(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public abstract double calculerValeur();

    @Override
    public String toString() {
        return nom + " - Quantité : " + quantite + " - Prix : " + prix + "€";
    }
}