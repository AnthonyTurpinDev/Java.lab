// S3_Exo15_BanqueArchitecture.java
// Énoncé : La mini banque finale. Chaque opération = 1 fonction.
//          Pas de logique dans main().
//          deposer(montant), retirer(montant), virer(montant, compteB),
//          afficherSolde(), afficherHistorique().
//          C'est ton projet de fin — si tu le codes sans regarder
//          les autres, tu es PRÊT pour la piscine du 30 août.

import java.util.Scanner;

public class S3_Exo15_BanqueArchitecture {

    static Scanner sc        = new Scanner(System.in);
    static double  soldeA    = 1000.0;
    static double  soldeB    = 500.0;
    static int     nbOps     = 0;
    static String  historique = "";

    static void enregistrer(String operation) {
        nbOps++;
        historique += nbOps + ". " + operation + "\n";
    }

    static boolean montantValide(double montant) {
        if (montant <= 0) { System.out.println("  Montant invalide."); return false; }
        return true;
    }

    static boolean soldesSuffisant(double solde, double montant) {
        if (montant > solde) { System.out.printf("  Solde insuffisant (%.2f€).%n", solde); return false; }
        return true;
    }

    static void deposer() {
        System.out.print("  Montant à déposer : ");
        double m = sc.nextDouble();
        if (!montantValide(m)) return;
        soldeA += m;
        enregistrer(String.format("Dépôt +%.2f€ → solde A : %.2f€", m, soldeA));
        System.out.printf("  Dépôt effectué. Nouveau solde : %.2f€%n", soldeA);
    }

    static void retirer() {
        System.out.print("  Montant à retirer : ");
        double m = sc.nextDouble();
        if (!montantValide(m) || !soldesSuffisant(soldeA, m)) return;
        soldeA -= m;
        enregistrer(String.format("Retrait -%.2f€ → solde A : %.2f€", m, soldeA));
        System.out.printf("  Retrait effectué. Nouveau solde : %.2f€%n", soldeA);
    }

    static void virer() {
        System.out.print("  Montant à virer vers B : ");
        double m = sc.nextDouble();
        if (!montantValide(m) || !soldesSuffisant(soldeA, m)) return;
        soldeA -= m;
        soldeB += m;
        enregistrer(String.format("Virement A→B %.2f€ | A:%.2f€ B:%.2f€", m, soldeA, soldeB));
        System.out.printf("  Virement OK. A : %.2f€ | B : %.2f€%n", soldeA, soldeB);
    }

    static void afficherSoldes() {
        System.out.printf("  Compte A : %.2f€%n", soldeA);
        System.out.printf("  Compte B : %.2f€%n", soldeB);
        System.out.println("  Opérations : " + nbOps);
    }

    static void afficherHistorique() {
        if (nbOps == 0) { System.out.println("  Aucune opération."); return; }
        System.out.println("  === Historique ===");
        System.out.print(historique);
    }

    static int afficherMenu() {
        System.out.println("\n1-Dépôt  2-Retrait  3-Virement  4-Soldes  5-Historique  0-Quitter");
        System.out.print("Choix : ");
        return sc.nextInt();
    }

    static void traiterChoix(int choix) {
        switch (choix) {
            case 1: deposer();           break;
            case 2: retirer();           break;
            case 3: virer();             break;
            case 4: afficherSoldes();    break;
            case 5: afficherHistorique();break;
            case 0: System.out.println("Au revoir ! " + nbOps + " opération(s) effectuée(s)."); break;
            default: System.out.println("Option invalide.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Banque Java ===");
        int choix;
        do {
            choix = afficherMenu();
            traiterChoix(choix);
        } while (choix != 0);
    }
}