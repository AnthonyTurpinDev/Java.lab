// S3_Exo4_TriBulles.java
// Énoncé : Tri à bulles sur un tableau de 6 entiers saisis.
//          Principe : compare chaque paire adjacente et échange si besoin.
//          Répète jusqu'à ce que le tableau soit trié.
//          Affiche le tableau avant et après.

import java.util.Scanner;

public class S3_Exo4_TriBulles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[6];

        System.out.println("Entre 6 entiers :");
        for (int i = 0; i < 6; i++) {
            System.out.print("  [" + i + "] : ");
            tab[i] = sc.nextInt();
        }

        System.out.print("Avant : ");
        for (int v : tab) System.out.print(v + " ");
        System.out.println();

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j+1]) {
                    int tmp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = tmp;
                }
            }
        }

        System.out.print("Après  : ");
        for (int v : tab) System.out.print(v + " ");
        System.out.println();
    }
}