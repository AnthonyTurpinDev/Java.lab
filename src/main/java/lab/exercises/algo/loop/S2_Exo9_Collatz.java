// S2_Exo9_Collatz.java
// Énoncé : Suite 3n+1 (conjecture de Collatz).
//          Si N est pair → N/2
//          Si N est impair → 3*N+1
//          Répète jusqu'à atteindre 1.
//          Affiche toute la suite et le nombre d'étapes.

import java.util.Scanner;

public class S2_Exo9_Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        long n = sc.nextLong();

        int etapes = 0;
        System.out.print(n);

        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else             n = 3 * n + 1;
            System.out.print(" → " + n);
            etapes++;
        }

        System.out.println("\nNombre d'étapes : " + etapes);
    }
}