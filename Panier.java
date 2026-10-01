/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmagasin;

/**
 *
 * @author androuleloup
 */

import java.util.ArrayList;

public class Panier {

    private ArrayList<Produit> produits;

    //Constructeur
    public Panier() {
        produits = new ArrayList<>();   // panier vide au début
    }

    //getters
    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        System.out.println(produit.getNom() + " ajouté au panier.");
    }

    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
        System.out.println(produit.getNom() + " retiré du panier.");
    }

    public void afficherPanier() {
        if (produits.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            System.out.println("  Votre panier : ");
            for (Produit p : produits) {
                System.out.println("- " + p.getNom() + " : " + p.getPrix() + " euros");
            }

        }
    }

    public double calculerTotal() {
        double total = 0;
        for (Produit p : produits){
            total = total + p.getPrix();
        }
        return total;
    }
}
