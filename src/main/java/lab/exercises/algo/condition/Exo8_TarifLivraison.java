package condition;
// Exo8_TarifLivraison.java
// Énoncé : Calcule le coût d'une livraison selon :
//   Zone 1 : <= 2kg → 5€ | <= 5kg → 8€ | > 5kg → 12€
//   Zone 2 : <= 2kg → 8€ | <= 5kg → 13€ | > 5kg → 20€
//   Zone 3 : tarif fixe 30€ quel que soit le poids

import java.util.Scanner;

public class Exo8_TarifLivraison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zone (1, 2 ou 3) : ");
        int zone = sc.nextInt();
        System.out.print("Poids (kg) : ");
        double poids = sc.nextDouble();

        double tarif;

        switch (zone) {
            case 1:
                if (poids <= 2)      tarif = 5;
                else if (poids <= 5) tarif = 8;
                else                 tarif = 12;
                break;
            case 2:
                if (poids <= 2)      tarif = 8;
                else if (poids <= 5) tarif = 13;
                else                 tarif = 20;
                break;
            case 3:
                tarif = 30;
                break;
            default:
                System.out.println("Zone invalide.");
                return;
        }

        System.out.printf("Tarif livraison : %.0f€%n", tarif);
    }
}