package condition;
// Exo15_PierreFeuilleCiseaux.java
// Énoncé : Joue contre l'ordinateur.
//          L'utilisateur entre 1=Pierre, 2=Feuille, 3=Ciseaux.
//          L'ordi choisit aléatoirement. Affiche qui gagne.

import java.util.Scanner;
import java.util.Random;

public class Exo15C_PierreFeuilleCiseaux {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("1=Pierre  2=Feuille  3=Ciseaux");
        System.out.print("Ton choix : ");
        int joueur = sc.nextInt();

        int ordi = rng.nextInt(3) + 1;

        String[] noms = {"", "Pierre", "Feuille", "Ciseaux"};

        if (joueur < 1 || joueur > 3) {
            System.out.println("Choix invalide.");
            return;
        }

        System.out.println("Toi : " + noms[joueur] + " | Ordi : " + noms[ordi]);

        if (joueur == ordi) {
            System.out.println("Égalité !");
        } else if ((joueur == 1 && ordi == 3) ||
                   (joueur == 2 && ordi == 1) ||
                   (joueur == 3 && ordi == 2)) {
            System.out.println("Tu gagnes !");
        } else {
            System.out.println("L'ordi gagne !");
        }
    }
}