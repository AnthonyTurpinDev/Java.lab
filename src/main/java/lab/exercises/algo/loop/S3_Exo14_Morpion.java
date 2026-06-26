// S3_Exo14_Morpion.java
// Énoncé : Morpion classique 3x3 pour 2 joueurs (X et O).
//          Chaque joueur entre la ligne (0-2) et la colonne (0-2).
//          Détecte la victoire (ligne, colonne, diagonale) et le match nul.
//          C'est l'exo le plus complet — plusieurs boucles imbriquées + logique.

import java.util.Scanner;

public class S3_Exo14_Morpion {
    static char[][] grille = new char[3][3];

    static void afficher() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grille[i][j] == 0 ? '.' : grille[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
        }
    }

    static boolean aGagne(char c) {
        for (int i = 0; i < 3; i++) {
            if (grille[i][0]==c && grille[i][1]==c && grille[i][2]==c) return true;
            if (grille[0][i]==c && grille[1][i]==c && grille[2][i]==c) return true;
        }
        return (grille[0][0]==c && grille[1][1]==c && grille[2][2]==c)
            || (grille[0][2]==c && grille[1][1]==c && grille[2][0]==c);
    }

    static boolean plein() {
        for (char[] ligne : grille)
            for (char c : ligne)
                if (c == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        char[] joueurs = {'X', 'O'};
        int tour = 0;

        while (true) {
            afficher();
            char j = joueurs[tour % 2];
            System.out.println("Tour de " + j);

            int ligne, col;
            do {
                System.out.print("Ligne (0-2) : "); ligne = sc.nextInt();
                System.out.print("Col   (0-2) : "); col   = sc.nextInt();
                if (ligne<0||ligne>2||col<0||col>2||grille[ligne][col]!=0)
                    System.out.println("Case invalide ou occupée.");
            } while (ligne<0||ligne>2||col<0||col>2||grille[ligne][col]!=0);

            grille[ligne][col] = j;

            if (aGagne(j)) {
                afficher();
                System.out.println("Victoire de " + j + " !");
                return;
            }
            if (plein()) {
                afficher();
                System.out.println("Match nul !");
                return;
            }
            tour++;
        }
    }
}