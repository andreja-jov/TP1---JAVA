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


public class Commande {
    
    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;

    //Constructeuer
    public Commande(int idCommande, Client client, Panier panier) {
        
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(panier.getProduits()); // copie du panier
        this.total = panier.calculerTotal();
    }

    public void afficherDetailsCommande() {
        
        System.out.println("=== Commande n°" + idCommande + " ===");
        client.afficherDetails();
        System.out.println("Produits commandés :");
        for (int i = 0; i < produitsCommandes.size(); i++) {
            Produit p = produitsCommandes.get(i);
            System.out.println("- " + p.getNom() + " : " + p.getPrix() + " euros");
        }
        
        System.out.println("Total à payer : " + total + " euros");
    }
}
