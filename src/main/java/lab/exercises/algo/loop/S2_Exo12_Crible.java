// S2_Exo12_Crible.java
// Énoncé : Affiche tous les nombres premiers jusqu'à N.
//          Algorithme : pour chaque i de 2 à N, vérifie s'il est premier
//          en testant tous les diviseurs de 2 à sqrt(i).
//          C'est une boucle dans une boucle avec break.

import java.util.Scanner;

public class S2_Exo12_Crible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombres premiers jusqu'à N : ");
        int n = sc.nextInt();

        System.out.print("Premiers : ");
        for (int i = 2; i <= n; i++) {
            boolean premier = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { premier = false; break; }
            }
            if (premier) System.out.print(i + " ");
        }
        System.out.println();
    }
}