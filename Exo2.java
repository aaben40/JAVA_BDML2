/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author adss4
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nb = 0;
        int result;
        int ind;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer nombre");
        ind=sc.nextInt();
        result=0;
        
        
        while(result <= ind){
            result=result+nb;
        
        }
        
        System.out.println();
        System.out.println("La somme des " + nb + "entiers est: "+result);
        }
    }
    
}
