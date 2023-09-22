/*
 * TP0_Addition
 * Permet d'additionner des nombres en fonction d'une valeur entrée
 * Septembre 2023
 */
package tp0_addition;

import java.util.Scanner;

/**
 *
 * @author iut
 */
public class TP0_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb; // nombre d'entiers à additionner
        int result; // resultat
        int ind; //indice 
        // initialisation
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nb=sc.nextInt(); 
        result=0; 
        // addition des nb premiers entiers 
        ind=1;
        while (ind< nb) { 
            result=result+ind;
            ind++;
        } 
        // affichage du resultat 
        System.out.println("La somme des "+ nb + " entiers est :"+result);
    }
    
}
