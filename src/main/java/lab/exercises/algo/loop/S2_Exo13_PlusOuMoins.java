// S2_Exo13_PlusOuMoins.java
// Énoncé : Version complète : nombre aléatoire entre 1 et 100,
//          tentatives illimitées, affiche le nombre d'essais à la fin.

import java.util.Scanner;
import java.util.Random;

public class S2_Exo13_PlusOuMoins {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int secret  = new Random().nextInt(100) + 1;
        int guess   = 0;
        int essais  = 0;

        System.out.println("Trouve le nombre entre 1 et 100 !");

        while (guess != secret) {
            System.out.print("Essai : ");
            guess = sc.nextInt();
            essais++;
            if      (guess < secret) System.out.println("Plus grand !");
            else if (guess > secret) System.out.println("Plus petit !");
            else System.out.println("Bravo en " + essais + " essai(s) !");
        }
    }
}