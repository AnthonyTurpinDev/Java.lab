// S3_Exo13_Snake1D.java
// Énoncé : Simule un snake sur une ligne de 20 cases.
//          Le snake commence à la position 10, bouge à droite (+1) ou gauche (-1).
//          Une pomme apparaît à une position aléatoire.
//          Le joueur entre 'd' (droite) ou 'g' (gauche) à chaque tour.
//          Affiche la grille à chaque tour. Le jeu s'arrête quand le
//          snake sort de la grille ou mange la pomme.

import java.util.Random;
import java.util.Scanner;

public class S3_Exo13_Snake1D {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Random rng  = new Random();
        int snake   = 10;
        int pomme   = rng.nextInt(18) + 1;
        if (pomme == snake) pomme = (pomme + 5) % 20;

        System.out.println("Snake 1D — 'd'=droite  'g'=gauche  'q'=quitter");

        while (snake >= 0 && snake < 20) {
            StringBuilder grille = new StringBuilder("[");
            for (int i = 0; i < 20; i++) {
                if      (i == snake) grille.append("S");
                else if (i == pomme) grille.append("*");
                else                 grille.append(".");
            }
            grille.append("]");
            System.out.println(grille);

            System.out.print("Direction : ");
            String dir = sc.next();

            if      (dir.equals("d")) snake++;
            else if (dir.equals("g")) snake--;
            else if (dir.equals("q")) { System.out.println("Abandon."); return; }
            else { System.out.println("Invalide."); continue; }

            if (snake == pomme) {
                System.out.println("Tu as mangé la pomme ! Victoire !");
                return;
            }
        }
        System.out.println("Sorti de la grille. Game over !");
    }
}