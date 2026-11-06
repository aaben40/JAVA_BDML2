/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author adss4
 */
public class Produit {
    private int id;
    private String nom;
    private int quantite;
    private int prix;
    
    // Méthodes
    
    Produit(int id, String nom, int quantite, int prix){
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }
    
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public int getQuantite(){
        return quantite;
    }
    public int getPrix(){
        return prix;
    }
    
    public void setPrix(int newPrix){
        this.prix = newPrix;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setNom(String newNom){
        this.nom = newNom;
    }
    public void setQuantite(int newQuantite){
        this.quantite = newQuantite;
    }
    
    public void afficherDetails(){
        System.out.println("Id: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Qauntité: " + quantite);
        
    }
}
