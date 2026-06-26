// S2_Exo8_MinMaxSerie.java
// Énoncé : L'utilisateur entre des entiers jusqu'à saisir 0.
//          Affiche le min et le max de la série.
//          PIÈGE : initialise min et max avec la première valeur,
//          pas avec 0 ou Integer.MAX_VALUE.

import java.util.Scanner;

public class S2_Exo8_MinMaxSerie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre des entiers (0 pour arrêter) :");

        int n = sc.nextInt();
        if (n == 0) { System.out.println("Aucune valeur."); return; }

        int min = n, max = n;

        while (n != 0) {
            if (n < min) min = n;
            if (n > max) max = n;
            n = sc.nextInt();
        }

        System.out.println("Min : " + min + " | Max : " + max);
    }
}