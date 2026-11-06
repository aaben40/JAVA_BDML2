/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author adss4
 */
public class Client {
    private int id;
    private String nom;
    private String email;
    
    Client(int id, String nom, String email){
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getEmail(){
        return email;
    }
    
    public void setId(int newId){
        this.id = newId;
    }
    public void setNom(String newNom){
        this.nom = newNom;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    public void afficherDetails(){
        System.out.println("Id: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Email: " + email);
        
    }
}
