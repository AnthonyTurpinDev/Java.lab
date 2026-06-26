// S3_Exo8_MorpionFonctions.java
// Énoncé : Reprends le morpion (semaine 3 boucles) et découpe-le.
//          initialiserGrille(char[][] g)
//          afficherGrille(char[][] g)
//          jouer(char[][] g, int ligne, int col, char joueur) → boolean
//          aGagne(char[][] g, char joueur) → boolean
//          estPlein(char[][] g) → boolean
//          jouerTour(char[][] g, char joueur) — saisit + valide + joue
//          Chaque fonction fait UNE chose. main() orchestre.

import java.util.Scanner;

public class S3_Exo8_MorpionFonctions {

    static Scanner sc = new Scanner(System.in);

    static void initialiserGrille(char[][] g) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                g[i][j] = '.';
    }

    static void afficherGrille(char[][] g) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(g[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
        }
    }

    static boolean caseLibre(char[][] g, int l, int c) {
        return l >= 0 && l < 3 && c >= 0 && c < 3 && g[l][c] == '.';
    }

    static boolean jouer(char[][] g, int l, int c, char joueur) {
        if (!caseLibre(g, l, c)) return false;
        g[l][c] = joueur;
        return true;
    }

    static boolean aGagne(char[][] g, char j) {
        for (int i = 0; i < 3; i++) {
            if (g[i][0]==j && g[i][1]==j && g[i][2]==j) return true;
            if (g[0][i]==j && g[1][i]==j && g[2][i]==j) return true;
        }
        return (g[0][0]==j && g[1][1]==j && g[2][2]==j)
            || (g[0][2]==j && g[1][1]==j && g[2][0]==j);
    }

    static boolean estPlein(char[][] g) {
        for (char[] row : g) for (char c : row) if (c == '.') return false;
        return true;
    }

    static void jouerTour(char[][] g, char joueur) {
        int l, c;
        do {
            System.out.println("Tour de " + joueur);
            System.out.print("  Ligne (0-2) : "); l = sc.nextInt();
            System.out.print("  Col   (0-2) : "); c = sc.nextInt();
            if (!caseLibre(g, l, c)) System.out.println("  Case invalide !");
        } while (!jouer(g, l, c, joueur));
    }

    public static void main(String[] args) {
        char[][] grille = new char[3][3];
        initialiserGrille(grille);
        char[] joueurs = {'X', 'O'};
        int tour = 0;

        while (true) {
            afficherGrille(grille);
            char j = joueurs[tour % 2];
            jouerTour(grille, j);
            if (aGagne(grille, j)) {
                afficherGrille(grille);
                System.out.println("Victoire de " + j + " !"); return;
            }
            if (estPlein(grille)) {
                afficherGrille(grille);
                System.out.println("Match nul !"); return;
            }
            tour++;
        }
    }
}