/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_debs;

import java.util.Scanner;

/**
 *
 * @author iut
 */
public class TP2_convertisseurObjet_DEBS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur unConvertisseur = new Convertisseur();
        Scanner sc = new Scanner(System.in);
        boolean fini =false;
        
        
        while(fini!=true){
            System.out.println("saisissez une valeur :");
            double temp=sc.nextDouble();
            System.out.println("""
                           Saisissez la convestion que vous souhaitez effectuer :
                           1. De Celsius vers Kelvin
                           2. De Celsius vers Farenheit
                           3. De Kelvin vers Celsius
                           4. De Farenheit vers Celsius
                           5. Kelvin vers Farenheit
                           6. Farenheit vers Kelvin
                           7. Arreter""");
        
            int condition=sc.nextInt();
            switch(condition){
                case 1 ->{
                    unConvertisseur.CvK(temp);
                    break;
                }
                case 2 ->{
                    unConvertisseur.CvF(temp);
                    break;
                }
                case 3 ->{
                    unConvertisseur.KvC(temp);
                    break;
                }
                case 4 ->{
                    unConvertisseur.FvC(temp);
                    break;
                }
                case 5->{
                    unConvertisseur.KvF(temp);
                break;
                }
                case 6->{
                    unConvertisseur.FvK(temp);
                    break;
                }
                case 7->{
                    fini=true;
                    System.out.println(unConvertisseur);
                    break;
                }
            }
        }
    }
}
