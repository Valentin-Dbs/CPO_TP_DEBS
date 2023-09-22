/*
 * TP1_stats
 * Vérifier si la distribution de nombre du générateur de nombre aléatoire est bien aléatoire
 * Septembre 2023
 */
package tp1_stats;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iut
 */
public class TP1_stats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialisation du tableau :
        int[] tableau = new int[6];

        //Initialisation du scanner :
        Scanner sc = new Scanner(System.in);

        //Création du générateur aléatoire
        Random nombreAleatoire = new Random();
        int nombre;

        //Récupération du nombre
        System.out.println("Saisissez un nombre :");
        int m = sc.nextInt();

        //Boucle
        for (int n=m;n> 0;n--) {
            nombre = nombreAleatoire.nextInt(6);
            tableau[nombre] += 1;
        }
        for(int i=0; i<6;i++){
            System.out.println(tableau[i]*100/m+"%");
        }
    }

}
