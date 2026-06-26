// Exo13_Impot.java
// Énoncé : Calcule l'impôt selon les tranches suivantes (simplifié) :
//   <= 10 000€       → 0%
//   10 001 à 25 000€ → 11% sur la partie dans cette tranche
//   25 001 à 73 000€ → 30% sur la partie dans cette tranche
//   > 73 000€        → 41% sur la partie dans cette tranche
// Affiche le montant total d'impôt à payer.

import java.util.Scanner;

public class Exo13_Impot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Revenu annuel (€) : ");
        double revenu = sc.nextDouble();

        double impot = 0;

        if (revenu > 73000) {
            impot += (revenu - 73000) * 0.41;
            revenu = 73000;
        }
        if (revenu > 25000) {
            impot += (revenu - 25000) * 0.30;
            revenu = 25000;
        }
        if (revenu > 10000) {
            impot += (revenu - 10000) * 0.11;
        }

        System.out.printf("Impôt à payer : %.2f€%n", impot);
    }
}