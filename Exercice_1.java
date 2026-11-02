/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package exercice_1;

import java.util.Scanner;
/**
 *
 * @author adss4
 */
public class Exercice_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom = "";
        String prenom = "";
        
        Scanner sc = new Scanner(System.in);
        
        nom = sc.nextLine() ;
        prenom = sc.nextLine();
        
        System.out.println("Nom: " + nom + " Prénom: " + prenom);  
        
        if ("POTTER".equals(nom) & "Harry".equals(prenom)){
            System.out.println("Bienvenu Harry PORTTER");}
        else{
                System.out.println("FAUX");
                }
        System.out.println("Quel est votre age ?");
        int age = sc.nextInt();
        
        System.out.println("Quel est votre age (mere) ?");
        int age_mere = sc.nextInt();
        
        System.out.println("Quel est votre age (pere) ?");
        int age_pere = sc.nextInt();
        
        float addition = age_pere + age_mere;
        float soustraction = age_pere - age_mere;
        float division = age_pere / age_mere;
        
        float result[] = new float[3];
        result[0] = addition;
        result[1] = soustraction;
        result[2] = division;
        //for(int i = 0; i<3; i++){
        //    if (result[i] > age_m
        //}
        
        if (age_pere > age_mere){
            System.out.println("Supérieur");
        }
        else {
            System.out.println("Inférieur");
        }
                  
    
    }
    
}
