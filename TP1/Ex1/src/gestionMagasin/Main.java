/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author adss4
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Création des produits
        Produit p1 = new Produit(1, "Ordinateur", 100, 12);
        Produit p2 = new Produit(2, "Souris", 100, 5);
        Produit p3 = new Produit(3, "Clavier", 100, 9);

        // Création du magasin
        Magasin magasin = new Magasin();

        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);

        // Création du client
        Client client = new Client(1, "Dupont", "bbbb@gmail.com");

        // Création du panier
        Panier panier = new Panier();
        
        int id_com = 0;

        int choix;

        do {
            System.out.println("\n===== MENU MAGASIN =====");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {

                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Nom du produit à ajouter : ");
                    String nom = sc.nextLine();

                    Produit produit = magasin.trouverProduitParNom(nom);

                    if (produit != null) {
                        panier.ajouterProduit(produit);
                        System.out.println("Produit ajouté au panier !");
                    } else {
                        System.out.println("Produit introuvable.");
                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    break;
                case 4:
                    if(panier.calculerTotal() == 0){
                        System.out.println("Votre panier eest vide");
                        break;
                    }
                    Commande commande = new Commande(id_com,client,panier);
                    commande.afficherDetailsCommande();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        sc.close();
    }
}