// S2_Exo2_NombreParfait.java
// Énoncé : Un nombre parfait est égal à la somme de ses diviseurs
//          (sauf lui-même). Ex : 6 = 1+2+3, 28 = 1+2+4+7+14.
//          Vérifie si N est parfait.

import java.util.Scanner;

public class S2_Exo2_NombreParfait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();

        int somme = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) somme += i;
        }

        if (somme == n) System.out.println(n + " est un nombre parfait !");
        else            System.out.println(n + " n'est pas parfait. Somme diviseurs = " + somme);
    }
}