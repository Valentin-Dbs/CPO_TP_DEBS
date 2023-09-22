/*
 * TP1_convertisseur
 * Convertir une température
 * Septembre 2023
 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author iut
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisissez une valeur :");
        double temp=sc.nextDouble();
        System.out.println("""
                           Saisissez la convestion que vous souhaitez effectuer :
                           1. De Celsius vers Kelvin
                           2. De Celsius vers Farenheit
                           3. De Kelvin vers Celsius
                           4. De Farenheit vers Celsius
                           5. Kelvin vers Farenheit
                           6. Farenheit vers Kelvin""");
        
        int condition=sc.nextInt();
        double resultat;
        switch(condition){
            case 1 ->{
                resultat=CelsiusVersKelvin(temp);
                System.out.println(resultat+" °K");
                break;
            }
            case 2 ->{
                resultat=CelsiusVersFarenheit(temp);
                System.out.println(resultat+" °F");
                break;
            }
            case 3 ->{
                resultat=KelvinVersCelsius(temp);
                System.out.println(resultat+" °C");
                break;
            }
            case 4 ->{
                resultat=FarenheitVersCelsius(temp);
                System.out.println(resultat+" °C");
                break;
            }
            case 5->{
                resultat=KelvinVersFarenheit(temp);
                System.out.println(resultat+" °F");
                break;
            }
            case 6->{
                resultat=FarenheitVersKelvin(temp);
                System.out.println(resultat+" °K");
                break;
            }
        }
    }
    public static double CelsiusVersKelvin (double temp){
        double resultat =temp+274.1;
        return resultat;
    }
    public static double CelsiusVersFarenheit (double temp){
        double resultat=(temp*(9/5))+32;
        return resultat;
    }
    public static double KelvinVersCelsius (double temp){
        double resultat=temp-274.1;
        return resultat;
    }
    public static double FarenheitVersCelsius (double temp){
        double resultat=(temp-32)*(5/9);
        return resultat;
    }
    public static double KelvinVersFarenheit (double temp){
        double resultat=CelsiusVersFarenheit(KelvinVersCelsius(temp));
        return resultat;
    }
    public static double FarenheitVersKelvin (double temp){
        double resultat=CelsiusVersKelvin(FarenheitVersCelsius(temp));
        return resultat;
    }
}
