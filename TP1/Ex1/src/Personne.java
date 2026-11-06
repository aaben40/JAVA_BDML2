/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author adss4
 */
public class Personne {
    private String nom;
    private String prenom;
    private String date;
    private int annee_naissance;
    
    private static int nbPersonnes = 0;
    
    
    Personne(String nom, String prenom, String date){
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        nbPersonnes++;
        afficherNbr();
    }
    public Personne(){
        this("Potter","Harry","1980-01-01");
    }
    Personne(String prenom, String date){
        nom = "inconnu";
        this.prenom = prenom;
        LocalDate date_parser = LocalDate.parse(date);
        
        
        this.annee_naissance = date_parser.getYear();
    }
    
    // Getters
    
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getDate(){
        return date;
    }
    public int getAnnee(){
        return annee_naissance;
    }
    
    // Setters
    
    public void setNom(String newNom){
        this.nom = newNom;
    }
    public void setPrenom(String newPrenom){
        this.prenom = newPrenom;
    }
    public void setDate(String newDate){
        this.date = newDate;
    }
    public void setAnnee(int newAnnee){
        this.annee_naissance = newAnnee;
    }
    
    
    // Methodes
    
    public int calculerAge(){
        LocalDate anniv = LocalDate.parse(date);
        LocalDate maintenant = LocalDate.now();
        Period period = Period.between(anniv, maintenant);
        
        return period.getYears();
        
    }
    
    public void afficherInfos(){
        System.out.println("Nom: " + nom +
                "\nPrenom: " + prenom +
                "\nAge: " + calculerAge());
    }
    
    public void mange(String phrase){
        System.out.println(nom + " " + prenom + " " + phrase);
    }
    
    public void afficherNbr(){
        System.out.println("Nombre de personne créées : " + nbPersonnes);
    }
    
    public static void main(String[] args) {
        Personne personne1 = new Personne("Dupont", "Jean","2005-01-01");
        Personne personne2 = new Personne();
        Personne personne3 = new Personne("Othman", "2005-01-01");
        personne1.afficherInfos();
        personne2.afficherInfos();
        personne3.afficherInfos();
}
    
}
