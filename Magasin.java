/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmagasin;
import java.util.ArrayList;
/**
 *
 * @author androuleloup
 */
public class Magasin {
    
    private ArrayList<Produit> produits;

    //Constructeur
    public Magasin() {
        produits = new ArrayList<>();
    }
    
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }
    
    public void afficherProduitsDisponibles() {
        System.out.println("--- Produits disponibles ---");
        for (Produit p : produits) {
            if (p.getQuantite() > 0) {
                p.afficherDetails();
            } else {
                System.out.println(p.getId() + " - " + p.getNom() + " : rupture de stock");
            }
        }
    }
    
    public Produit trouverProduitParNom(String nom) {
        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }
        return null;
    }
}

