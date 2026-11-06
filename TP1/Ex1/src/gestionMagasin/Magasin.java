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

public class Magasin {

    // Attribut
    private ArrayList<Produit> produits;

    // Constructeur
    public Magasin() {
        this.produits = new ArrayList<>();
    }

    // Ajouter un produit au magasin
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Afficher les produits disponibles
    public void afficherProduitsDisponibles() {
        System.out.println("===== PRODUITS DISPONIBLES =====");

        for (Produit p : produits) {
            System.out.println(p.getNom());
        }
    }

    // Trouver un produit par son nom
    public Produit trouverProduitParNom(String nom) {

        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }

        return null;
    }
}
