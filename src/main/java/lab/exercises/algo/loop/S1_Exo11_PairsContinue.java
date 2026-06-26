// S1_Exo11_PairsContinue.java
// Énoncé : Affiche tous les nombres de 1 à N, mais saute les impairs
//          avec continue. Comprends bien : continue saute le reste
//          du bloc et passe à l'itération suivante.

import java.util.Scanner;

public class S1_Exo11_PairsContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}