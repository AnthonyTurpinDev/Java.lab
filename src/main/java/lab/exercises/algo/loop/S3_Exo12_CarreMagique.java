// S3_Exo12_CarreMagique.java
// Énoncé : Un carré magique 3x3 contient les chiffres 1-9.
//          Toutes les lignes, colonnes et diagonales ont la même somme (15).
//          L'utilisateur entre 9 valeurs. Vérifie si c'est un carré magique.

import java.util.Scanner;

public class S3_Exo12_CarreMagique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] carre = new int[3][3];

        System.out.println("Entre les 9 valeurs du carré (ligne par ligne) :");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                carre[i][j] = sc.nextInt();
            }

        int magique = 15;
        boolean ok = true;

        for (int i = 0; i < 3 && ok; i++) {
            int ligne = 0, col = 0;
            for (int j = 0; j < 3; j++) { ligne += carre[i][j]; col += carre[j][i]; }
            if (ligne != magique || col != magique) ok = false;
        }

        int d1 = carre[0][0]+carre[1][1]+carre[2][2];
        int d2 = carre[0][2]+carre[1][1]+carre[2][0];
        if (d1 != magique || d2 != magique) ok = false;

        System.out.println(ok ? "C'est un carré magique !" : "Ce n'est pas un carré magique.");
    }
}