// S2_Exo3_NombrePremier.java
// Énoncé : Un nombre premier n'est divisible que par 1 et lui-même.
//          Vérifie si N est premier.
//          OPTIMISATION : tu n'as pas besoin de tester jusqu'à N,
//          mais seulement jusqu'à sqrt(N).

import java.util.Scanner;

public class S2_Exo3_NombrePremier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " n'est pas premier.");
            return;
        }

        boolean premier = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                premier = false;
                break;
            }
        }

        if (premier) System.out.println(n + " est premier.");
        else         System.out.println(n + " n'est pas premier.");
    }
}