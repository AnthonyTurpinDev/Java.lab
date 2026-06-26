package condition;
// Exo5_Saison.java
// Énoncé : Entre un numéro de mois (1-12).
//          Affiche la saison correspondante.

import java.util.Scanner;

public class Exo5C_Saison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numéro de mois (1-12) : ");
        int mois = sc.nextInt();

        if (mois == 12 || mois == 1 || mois == 2) {
            System.out.println("Hiver");
        } else if (mois >= 3 && mois <= 5) {
            System.out.println("Printemps");
        } else if (mois >= 6 && mois <= 8) {
            System.out.println("Été");
        } else if (mois >= 9 && mois <= 11) {
            System.out.println("Automne");
        } else {
            System.out.println("Mois invalide");
        }
    }
}