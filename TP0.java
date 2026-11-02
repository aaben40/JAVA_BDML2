/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0;
import java.util.Scanner;
/**
 *
 * @author adss4
 */
public class TP0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nb;
        int result;
        int ind;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer nombre");
        nb=sc.nextInt();
        result=0;
        
        ind=1;
        while(result <= nb){
            result=result+ind;
        
        }
        
        System.out.println();
        System.out.println("La somme des " + nb + "entiers est: "+result);
        }
    }
    
