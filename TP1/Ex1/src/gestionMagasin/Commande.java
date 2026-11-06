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
public class Commande {
    private int idCommande;
    private Client client;
    private Panier produitsCommandes;
    private int total;
    
    public Commande(int idCommande, Client client, Panier produitsCommandes){
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = produitsCommandes;
        this.total = produitsCommandes.calculerTotal();
        
        
    }
    
    public void afficherDetailsCommande() {
    System.out.println("===== DETAILS DE LA COMMANDE =====");
    System.out.println("ID Commande : " + idCommande);
    System.out.println("Client : " + client.getNom());
    System.out.println("Produits commandés : ");

    produitsCommandes.afficherPanier();

    System.out.println("Total : " + total + " €");
}
}
