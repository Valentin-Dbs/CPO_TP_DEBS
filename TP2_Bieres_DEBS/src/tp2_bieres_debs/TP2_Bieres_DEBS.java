/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_debs;

/**
 *
 * @author iut
 */
public class TP2_Bieres_DEBS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
        uneBiere.ouverte=false;
        
        uneBiere.lireEtiquette();
        
        BouteilleBiere autreBiere=new BouteilleBiere("Cuvée des trolls", 6.6, "Abbaye de Leffe");
        autreBiere.ouverte=false;
        
        autreBiere.lireEtiquette();
        autreBiere.décapsuler();
        System.out.println(uneBiere);
        System.out.println(autreBiere);
    }
    
}
