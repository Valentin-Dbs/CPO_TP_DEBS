/*
 * TP1_manipNombresInt
 * Saisir et manipuler des nombres
 * Septembre 2023
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author iut
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier nombre :");
        int nb=sc.nextInt();
        System.out.println("Entrez le deuxième nimbre :");
        int nb2=sc.nextInt();
        
        int somme=nb+nb2;
        int difference=nb-nb2;
        int produit=nb*nb2;
        
        int division=nb/nb2;
        int rest=nb%nb2;
        
        System.out.println("La somme de ces nombre est "+somme+"\n"+"La différence entre le premier nombre t le deuxième est de "+difference+"\n"+"Le produit des deux nombre est de "+produit);
        System.out.println("Le résultat de la division du premier nombre par le deuxième est "+division);
        System.out.println("Et le reste est de "+rest);
    }
    
}
