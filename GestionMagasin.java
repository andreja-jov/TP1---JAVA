/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionmagasin;

import java.util.Scanner;

/**
 *
 * @author androuleloup
 */
public class GestionMagasin {

    public static void main(String[] args) {
        
        //Création
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit(1, "Album de Tiakola", 45.0, 12));
        magasin.ajouterProduit(new Produit(2, "Maillot signé de djokovic", 1000000, 2));
        magasin.ajouterProduit(new Produit(3, "Agenda", 5.0, 23));

        Client client = new Client(1, "Dupont", "dupont@mail.com");
        Panier panier = new Panier();

        Scanner sc = new Scanner(System.in);
        int numeroCommande = 1;
        int choix = 0;

        while (choix != 5) {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            if (choix == 1) {
                magasin.afficherProduitsDisponibles();

            } else if (choix == 2) {
                System.out.print("Nom du produit : ");
                String nom = sc.nextLine();
                Produit p = magasin.trouverProduitParNom(nom);
                if (p == null) {
                    System.out.println("Produit introuvable.");
                } else if (p.getQuantite() == 0) {
                    System.out.println("Plus de stock pour ce produit.");
                } else {
                    panier.ajouterProduit(p);
                    p.setQuantite(p.getQuantite() - 1);
                }

            } else if (choix == 3) {
                panier.afficherPanier();

            } else if (choix == 4) {
                if (panier.getProduits().isEmpty()) {
                    System.out.println("Votre panier est vide, rien à commander.");
                } else {
                    Commande commande = new Commande(numeroCommande, client, panier);
                    commande.afficherDetailsCommande();
                    numeroCommande++;
                    panier = new Panier();
                }

            } else if (choix == 5) {
                System.out.println("Au revoir !!!! A jamais :)");

            } else {
                System.out.println("Choix invalide.");
            }
        }
        sc.close();
    }
}