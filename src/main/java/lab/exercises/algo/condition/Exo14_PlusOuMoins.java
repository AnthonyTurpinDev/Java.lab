package condition;
// Exo14_PlusOuMoins.java
// Énoncé : L'ordi choisit un nombre entre 1 et 100.
//          L'utilisateur a 5 tentatives pour le trouver.
//          Après chaque essai : "plus grand", "plus petit" ou "Bravo !".
//          Si les 5 tentatives sont épuisées, révèle le nombre.

import java.util.Scanner;
import java.util.Random;

public class Exo14_PlusOuMoins {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Random rng  = new Random();
        int secret  = rng.nextInt(100) + 1;
        int essais  = 0;
        boolean gagne = false;

        System.out.println("=== Jeu du plus ou moins (1-100) ===");

        while (essais < 5 && !gagne) {
            System.out.print("Tentative " + (essais + 1) + "/5 : ");
            int guess = sc.nextInt();
            essais++;

            if (guess == secret) {
                System.out.println("Bravo ! Trouvé en " + essais + " essai(s) !");
                gagne = true;
            } else if (guess < secret) {
                System.out.println("Plus grand !");
            } else {
                System.out.println("Plus petit !");
            }
        }

        if (!gagne) {
            System.out.println("Perdu ! Le nombre était : " + secret);
        }
    }
}
