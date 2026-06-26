// S1_Exo14_Factorielle.java
// Énoncé : Lis N et calcule N! (factorielle).
//          0! = 1, 1! = 1, 5! = 120, 10! = 3628800
//          ATTENTION au type : utilise long pour les grands nombres.

import java.util.Scanner;

public class S1_Exo14_Factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Pas de factorielle pour les négatifs.");
            return;
        }

        long resultat = 1;
        for (int i = 2; i <= n; i++) {
            resultat *= i;
        }

        System.out.println(n + "! = " + resultat);
    }
}