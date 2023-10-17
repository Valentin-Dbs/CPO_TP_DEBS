/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_debs;

/**
 *
 * @author iut
 */
public class TP2_manip_DEBS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        assiette2.nbCalories = 800;

        assiette2 = assiette1;
        assiette1 = assiette3;

        Moussaka[] moussaka = new Moussaka[10];
        for (int i = 0; i < 10; i++) {
            moussaka[i] = new Moussaka(200);
        }
    }
}
