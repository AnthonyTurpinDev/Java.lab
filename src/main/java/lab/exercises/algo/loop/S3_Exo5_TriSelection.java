// S3_Exo5_TriSelection.java
// Énoncé : Tri par sélection sur 6 entiers.
//          Principe : trouve le minimum dans le reste du tableau,
//          place-le en tête, recommence.
//          Compare avec le tri à bulles : lequel fait moins d'échanges ?

import java.util.Scanner;

public class S3_Exo5_TriSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[6];

        System.out.println("Entre 6 entiers :");
        for (int i = 0; i < 6; i++) {
            System.out.print("  [" + i + "] : ");
            tab[i] = sc.nextInt();
        }

        int echanges = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[iMin]) iMin = j;
            }
            if (iMin != i) {
                int tmp = tab[i]; tab[i] = tab[iMin]; tab[iMin] = tmp;
                echanges++;
            }
        }

        System.out.print("Trié : ");
        for (int v : tab) System.out.print(v + " ");
        System.out.println("(" + echanges + " échanges)");
    }
}