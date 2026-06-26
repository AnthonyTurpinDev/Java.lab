package condition;
// Exo15_MiniRPG.java
// Énoncé : Combat entre le joueur (100 PV) et un monstre (80 PV).
//          Chaque tour, l'utilisateur choisit :
//            1 = Attaque (dégâts aléatoires 10-20)
//            2 = Soin (+15 PV, max 100)
//            3 = Fuite (50% de chance)
//          Le monstre attaque automatiquement chaque tour (5-15 dégâts).
//          Le combat s'arrête quand un des deux tombe à 0 PV ou en cas de fuite.

import java.util.Scanner;
import java.util.Random;

public class Exo15_MiniRPG {
    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        Random rng    = new Random();

        int pvJoueur  = 100;
        int pvMonstre = 80;
        int tour      = 1;

        System.out.println("=== Mini RPG ===");
        System.out.println("Vous affrontez le Monstre des Bois !");

        while (pvJoueur > 0 && pvMonstre > 0) {
            System.out.println("\n--- Tour " + tour + " ---");
            System.out.println("Vous : " + pvJoueur + " PV  |  Monstre : " + pvMonstre + " PV");
            System.out.println("1-Attaque  2-Soin  3-Fuite");
            System.out.print("Choix : ");
            int choix = sc.nextInt();

            if (choix == 1) {
                int degats = 10 + rng.nextInt(11);
                pvMonstre -= degats;
                System.out.println("Vous infligez " + degats + " dégâts !");
                if (pvMonstre <= 0) { System.out.println("Victoire ! Le monstre est vaincu !"); break; }

            } else if (choix == 2) {
                int soin = 15;
                pvJoueur = Math.min(100, pvJoueur + soin);
                System.out.println("Vous récupérez " + soin + " PV.");

            } else if (choix == 3) {
                if (rng.nextBoolean()) {
                    System.out.println("Vous fuyez avec succès !");
                    return;
                } else {
                    System.out.println("La fuite échoue !");
                }
            } else {
                System.out.println("Action invalide, vous perdez votre tour !");
            }

            // Tour du monstre
            if (pvMonstre > 0) {
                int degatsM = 5 + rng.nextInt(11);
                pvJoueur -= degatsM;
                System.out.println("Le monstre vous attaque pour " + degatsM + " dégâts !");
                if (pvJoueur <= 0) { System.out.println("Vous êtes mort. Game over."); }
            }

            tour++;
        }
    }
}