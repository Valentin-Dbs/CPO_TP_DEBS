/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_debs;

/**
 *
 * @author iut
 */
public class Convertisseur {
    int nbConversions;
    
    //Constructeur
    public Convertisseur(){
        nbConversions=0;
    }
    
    //toString()
    @Override
    public String toString(){
        return "nb de conversions : "+ nbConversions;
    }
    
    //Méthodes
    //Celcius vers Kelvin
    public void CvK(double param){
        double resultat=param+274.1;
        nbConversions+=1;
        System.out.println(resultat);
    }
    // Kelvin Vers Celcius
    public void KvC(double param){
        double resultat=param-274.1;
        nbConversions+=1;
        System.out.println(resultat);
    }
    //Farenheit vers Celcius
    public void FvC(double param){
        double resultat=(param-32)*(5/9);
        nbConversions+=1;
        System.out.println(resultat);
    }
    //Celcius vers Farenheit
    public void CvF(double param){
        double resultat=(param*(9/5))+32;
        nbConversions+=1;
        System.out.println(resultat);
    }
    //Farenheit vers kelvin
    public void FvK(double param){
        double resultat=(param-32)*(5/9);
        resultat+=274.1;
        nbConversions+=1;
        System.out.println(resultat);
    }
    //Kelvin vers farenheit
    public void KvF(double param){
        double resultat=param-274.1;
        resultat-=274.1;
        nbConversions+=1;
        System.out.println(resultat);
    }
}
