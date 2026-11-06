/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

import java.util.ArrayList;

/**
 *
 * @author adss4
 */
public class Panier {
    private ArrayList<Produit> produits;
    
    public Panier(){
        this.produits = new ArrayList<Produit>();
    }
    
    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }
    public void supprimerProduit(Produit produit){
        produits.remove(produit);
    }
    
    public int calculerTotal(){
        int total = 0;
        for(int i = 0; i<produits.size();i++){
            total = total + produits.get(i).getPrix() * produits.get(i).getQuantite();
        }
        
        return total;
    }
    
    public void afficherPanier(){
        for(int i = 0; i<produits.size(); i++){
            System.out.println("Détails du produit " + produits.get(i).getNom() + " :");
            produits.get(i).afficherDetails();
        }
    }
}
