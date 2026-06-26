// S3_Exo6_RechercheLineaire.java
// Énoncé : Remplis un tableau de 8 entiers aléatoires (1-50).
//          L'utilisateur entre une valeur à chercher.
//          Affiche si elle est trouvée et à quel(s) index.

import java.util.Random;
import java.util.Scanner;

public class S3_Exo6_RechercheLineaire {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[8];

        System.out.print("Tableau : ");
        for (int i = 0; i < 8; i++) {
            tab[i] = rng.nextInt(50) + 1;
            System.out.print(tab[i] + " ");
        }

        System.out.print("\nValeur à chercher : ");
        int cible = sc.nextInt();

        boolean trouve = false;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == cible) {
                System.out.println("Trouvé à l'index " + i);
                trouve = true;
            }
        }
        if (!trouve) System.out.println(cible + " non trouvé dans le tableau.");
    }
}