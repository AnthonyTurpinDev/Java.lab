// S3_Exo14_MorpionArchitecture.java
// Énoncé : Version finale du morpion avec architecture propre.
//          Chaque action est une fonction avec un nom explicite.
//          Pas une seule ligne de logique dans main().
//          main() = orchestre UNIQUEMENT.
//          C'est le standard attendu à la piscine Epitech.

import java.util.Scanner;

public class S3_Exo14_MorpionArchitecture {

    static Scanner sc      = new Scanner(System.in);
    static char[][] grille = new char[3][3];
    static char[]   joueurs = {'X', 'O'};

    static void initialiser() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                grille[i][j] = '.';
    }

    static void afficher() {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grille[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean caseValide(int l, int c) {
        return l >= 0 && l < 3 && c >= 0 && c < 3 && grille[l][c] == '.';
    }

    static void placerJeton(int l, int c, char joueur) {
        grille[l][c] = joueur;
    }

    static int[] demanderCase(char joueur) {
        int l, c;
        do {
            System.out.println("Joueur " + joueur + ", entre ta case :");
            System.out.print("  Ligne : "); l = sc.nextInt();
            System.out.print("  Col   : "); c = sc.nextInt();
            if (!caseValide(l, c)) System.out.println("  Case invalide ou occupée !");
        } while (!caseValide(l, c));
        return new int[]{l, c};
    }

    static boolean ligneGagnante(char j) {
        for (int i = 0; i < 3; i++)
            if (grille[i][0]==j && grille[i][1]==j && grille[i][2]==j) return true;
        return false;
    }

    static boolean colonneGagnante(char j) {
        for (int i = 0; i < 3; i++)
            if (grille[0][i]==j && grille[1][i]==j && grille[2][i]==j) return true;
        return false;
    }

    static boolean diagonaleGagnante(char j) {
        return (grille[0][0]==j && grille[1][1]==j && grille[2][2]==j)
            || (grille[0][2]==j && grille[1][1]==j && grille[2][0]==j);
    }

    static boolean aGagne(char j) {
        return ligneGagnante(j) || colonneGagnante(j) || diagonaleGagnante(j);
    }

    static boolean grilleEstPleine() {
        for (char[] row : grille) for (char c : row) if (c == '.') return false;
        return true;
    }

    static void annoncerVictoire(char j) {
        System.out.println("*** Victoire du joueur " + j + " ! ***");
    }

    static void annoncerMatchNul() {
        System.out.println("*** Match nul ! ***");
    }

    public static void main(String[] args) {
        initialiser();
        int tour = 0;

        while (true) {
            afficher();
            char joueur = joueurs[tour % 2];
            int[] pos = demanderCase(joueur);
            placerJeton(pos[0], pos[1], joueur);

            if (aGagne(joueur))    { afficher(); annoncerVictoire(joueur); return; }
            if (grilleEstPleine()) { afficher(); annoncerMatchNul();       return; }
            tour++;
        }
    }
}