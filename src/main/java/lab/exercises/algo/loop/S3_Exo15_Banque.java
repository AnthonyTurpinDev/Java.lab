// S3_Exo15_Banque.java
// Énoncé : Simule un compte bancaire avec un menu en boucle.
//          Solde initial : 1000€.
//          1 - Dépôt (montant > 0)
//          2 - Retrait (impossible si solde insuffisant)
//          3 - Afficher solde et historique (nb opérations)
//          4 - Virer vers un autre compte (2ème solde)
//          0 - Quitter
//          C'est le projet final — tout ce que tu as appris est dedans.

import java.util.Scanner;

public class S3_Exo15_Banque {
    public static void main(String[] args) {
        Scanner sc     = new Scanner(System.in);
        double soldeA  = 1000.0;
        double soldeB  = 500.0;
        int operations = 0;
        int choix;

        System.out.println("=== Banque Java ===");
        System.out.printf("Compte A : %.2f€  |  Compte B : %.2f€%n%n", soldeA, soldeB);

        do {
            System.out.println("1-Dépôt  2-Retrait  3-Solde  4-Virement  0-Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Montant à déposer : ");
                    double depot = sc.nextDouble();
                    if (depot <= 0) { System.out.println("Montant invalide."); break; }
                    soldeA += depot;
                    operations++;
                    System.out.printf("Dépôt OK. Nouveau solde A : %.2f€%n", soldeA);
                    break;

                case 2:
                    System.out.print("Montant à retirer : ");
                    double retrait = sc.nextDouble();
                    if (retrait <= 0) { System.out.println("Montant invalide."); break; }
                    if (retrait > soldeA) { System.out.println("Solde insuffisant !"); break; }
                    soldeA -= retrait;
                    operations++;
                    System.out.printf("Retrait OK. Nouveau solde A : %.2f€%n", soldeA);
                    break;

                case 3:
                    System.out.printf("Compte A : %.2f€%n", soldeA);
                    System.out.printf("Compte B : %.2f€%n", soldeB);
                    System.out.println("Opérations effectuées : " + operations);
                    break;

                case 4:
                    System.out.print("Montant à virer de A vers B : ");
                    double virement = sc.nextDouble();
                    if (virement <= 0) { System.out.println("Montant invalide."); break; }
                    if (virement > soldeA) { System.out.println("Solde insuffisant !"); break; }
                    soldeA -= virement;
                    soldeB += virement;
                    operations++;
                    System.out.printf("Virement OK. A : %.2f€  B : %.2f€%n", soldeA, soldeB);
                    break;

                case 0:
                    System.out.println("Session terminée. " + operations + " opération(s).");
                    break;

                default:
                    System.out.println("Option invalide.");
            }
            System.out.println();

        } while (choix != 0);
    }
}