/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author Adam BEN AMAR
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator: \n"
                + "1) add \n"
                + "2) substract \n"
                + "3) multiply \n"
                + "4) divide \n"
                + "5) modulo \n");
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        if(operateur < 1 || operateur > 5){
            System.out.println("Erreur: opérateur hors de la demande");
            return;
        }
        System.out.println("Entrez la première valeur");
        int operande1 = sc.nextInt();
        System.out.println("Entrez la deuxième valeur");
        int operande2 = sc.nextInt();
        int result = 0;
        
        
        switch(operateur){
            case(1):
                result = operande1 + operande2;
                break;
            case(2):
                result = operande1 - operande2;
                break;
            case(3):
                result = operande1 * operande2;
                break;
            case(4):
                result = operande1 / operande2;
                break;
            case(5):
                result = operande1 % operande2;
                break;
        }
        
        System.out.println("The result is : "+ result);
        
    }
    
}
