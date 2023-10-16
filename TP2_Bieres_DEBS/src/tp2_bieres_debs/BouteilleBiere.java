/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_debs;

/**
 *
 * @author iut
 */
public class BouteilleBiere {
    //Création des attribus
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    //méthode qui permet de lire les informations de l'étiquette
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie );
}
    
    //méthode permettant de décapsuler la bouteille
    public void décapsuler(){
        if (ouverte==false){
            ouverte=true;
        }
        else System.out.println("Erreur : biere déjà ouverte");
    }
    
    //Constructeur
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
}
    
    //Méthode toString qui permet de définir ce que l'on veut afficher quand on demande un affichage de l'objet
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
}
