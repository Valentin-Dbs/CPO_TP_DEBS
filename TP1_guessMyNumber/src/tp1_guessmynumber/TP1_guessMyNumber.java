/*
 * TP1_guessMyNumber
 * Un nombre aléatoire est choisi et le joueur doit le deviner
 * Septembre 2023
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iut
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Choix du niveau de difficulté
        System.out.println("""
                           Choisissez le niveau de difficulté :
                           1. Facile
                           2. Moyen
                           3. Difficile
                           4. Cauchemard""");
        //création du scanner
        Scanner sc = new Scanner(System.in);
        //récupération de la valeur de la difficulté
        int difficulte = sc.nextInt();
        //création de la variable qui va contenir le numéro
        int n;
        // Création du générateur
        Random generateurAleat = new Random();
        //Création du générateur pour le pourcentage
        Random pourcentage=new Random();
        //Création de la variable pour le pourcentage d'erreur
        int percent;
        //Modification de l'intervalle en fonction de la difficulté
        switch (difficulte) {
            case 1 -> {
                n = generateurAleat.nextInt(100);
                System.out.println("Difficulté facile choisie");
                break;
            }
            case 2 -> {
                n = generateurAleat.nextInt(500);
                System.out.println("Difficulté moyenne choisie");
                break;
            }
            case 3 -> {
                n = generateurAleat.nextInt(1000);
                System.out.println("Difficulté difficile choisie (10 coups total)");
                break;
            }
            case 4->{
                n=generateurAleat.nextInt(1000);
                System.out.println("Difficulté cauchemard choisie (10 coups total et possibilité d'erreur dans les réponses)");
            }
            default->{
                n=2;
                break;
            }
        }

        System.out.println("Choisissez un nombre :");
        int b = sc.nextInt();
        int compteur = 1;
        while (b != n) {
            if (b > n) {
                if ((difficulte == 3|difficulte==4) && compteur >= 10) {
                    System.out.println("Vous avez perdu !!");
                    System.exit(0);
                    
                } else if (difficulte==2){
                    System.out.println("Le nombre est trop grand");
                } else if (difficulte==1){
                    if (b-n>10){
                        System.out.println("Le nombre est beaucoup trop grand");
                    } else {
                        System.out.println("Le nombre est trop grand ");
                    }
                } else if (difficulte==4){
                    percent=pourcentage.nextInt(100);
                    if (percent>30){
                        System.out.println("Le nombre est trop grand");
                    } else{
                        System.out.println("Le nombre est trop petit");
                    }
                }
                b = sc.nextInt();
                compteur++;
            } else if (b < n) {
                if ((difficulte == 3|difficulte==4) && compteur >= 10) {
                    System.out.println("Vous avez perdu !!");
                    System.exit(0);
                } else if (difficulte==2){
                    System.out.println("Le nombre est trop petit");
                } else if (difficulte==1){
                    if (n-b>10){
                        System.out.println("Le nombre est beaucoup trop petit");
                    } else {
                        System.out.println("Le nombre est trop petit");
                    }
                } else if (difficulte==4){
                    percent=pourcentage.nextInt(100);
                    if (percent>30){
                        System.out.println("Le nombre est trop petit");
                    }else{
                        System.out.println("Le nombre est trop grand");
                    }
                }
                b = sc.nextInt();
                compteur++;
            }
        }
        System.out.println("Gagné, vous avez fait " + compteur + " tentatives");

    }

}
