/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmagasin;

/**
 *
 * @author androuleloup
 */
public class Client {
    private int id;
    private String nom;
    private String email;
    
    //Constructeur
    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    //Guetters
    public int getId() { 
        return id; 
    }
    public String getNom() { 
        return nom; 
    }
    public String getEmail() { 
        return email; 
    }

    //Setters
    public void setId(int id) { 
        this.id = id; 
    }
    public void setNom(String nom) { 
        this.nom = nom; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }

    public void afficherDetails() {
        System.out.println("Client n°" + id + " : " + nom + " (" + email + ")");
    }
}
