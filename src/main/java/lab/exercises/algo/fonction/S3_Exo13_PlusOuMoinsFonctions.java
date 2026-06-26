// S3_Exo13_PlusOuMoinsFonctions.java
// Énoncé : Reprends le jeu du plus ou moins, découpé en fonctions.
//          genererSecret(int min, int max) → int
//          lireProposition(int tentative, int max) → int
//          donnerIndice(int guess, int secret)
//          aGagne(int guess, int secret) → boolean
//          afficherResultat(int secret, int essais, boolean gagne)
//          jouer(int min, int max, int maxEssais)

import java.util.Scanner;
import java.util.Random;

public class S3_Exo13_PlusOuMoinsFonctions {

    static Scanner sc  = new Scanner(System.in);
    static Random  rng = new Random();

    static int genererSecret(int min, int max) {
        return min + rng.nextInt(max - min + 1);
    }

    static int lireProposition(int tentative, int maxEssais) {
        System.out.print("Essai " + tentative + "/" + maxEssais + " : ");
        return sc.nextInt();
    }

    static void donnerIndice(int guess, int secret) {
        if      (guess < secret) System.out.println("  → Plus grand !");
        else if (guess > secret) System.out.println("  → Plus petit !");
    }

    static boolean aGagne(int guess, int secret) {
        return guess == secret;
    }

    static void afficherResultat(int secret, int essais, boolean gagne) {
        if (gagne) System.out.println("Bravo ! Trouvé en " + essais + " essai(s) !");
        else       System.out.println("Perdu ! C'était : " + secret);
    }

    static void jouer(int min, int max, int maxEssais) {
        int secret = genererSecret(min, max);
        int essais = 0;
        boolean gagne = false;

        System.out.println("Trouve un nombre entre " + min + " et " + max + " (" + maxEssais + " essais)");

        while (essais < maxEssais && !gagne) {
            int guess = lireProposition(essais + 1, maxEssais);
            essais++;
            if (aGagne(guess, secret)) { gagne = true; }
            else donnerIndice(guess, secret);
        }

        afficherResultat(secret, essais, gagne);
    }

    public static void main(String[] args) {
        jouer(1, 100, 7);
    }
}