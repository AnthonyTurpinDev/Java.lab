// S1_Exo8_MenuInteractif.java
// Énoncé : Affiche un menu avec 3 options et l'option 0 pour quitter.
//          Le menu se réaffiche après chaque action jusqu'à ce que
//          l'utilisateur choisisse 0.

import java.util.Scanner;

public class S1_Exo8_MenuInteractif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Dire bonjour");
            System.out.println("2 - Afficher la date (fictive)");
            System.out.println("3 - Compter jusqu'à 5");
            System.out.println("0 - Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1: System.out.println("Bonjour !"); break;
                case 2: System.out.println("Nous sommes le 30/08/2025"); break;
                case 3:
                    for (int i = 1; i <= 5; i++) System.out.print(i + " ");
                    System.out.println();
                    break;
                case 0: System.out.println("Au revoir !"); break;
                default: System.out.println("Option invalide.");
            }
        } while (choix != 0);
    }
}