// S1_Exo9_Accumulateur.java
// Énoncé : L'utilisateur entre des nombres un par un.
//          Il entre -1 pour arrêter.
//          Affiche la somme et la moyenne des nombres saisis.

import java.util.Scanner;

public class S1_Exo9_Accumulateur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somme = 0;
        int compte = 0;
        int n;

        System.out.println("Entre des entiers (-1 pour arrêter) :");

        do {
            n = sc.nextInt();
            if (n != -1) {
                somme += n;
                compte++;
            }
        } while (n != -1);

        if (compte == 0) {
            System.out.println("Aucun nombre saisi.");
        } else {
            System.out.println("Somme   : " + somme);
            System.out.printf("Moyenne : %.2f%n", somme / compte);
        }
    }
}