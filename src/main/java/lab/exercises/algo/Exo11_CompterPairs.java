// Exo11_CompterPairs.java
// Énoncé : Lis un entier N. Compte et affiche combien de nombres
//          pairs il y a entre 1 et N inclus.

import java.util.Scanner;

public class Exo11_CompterPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre N : ");
        int n = sc.nextInt();

        int compteur = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                compteur++;
            }
        }

        System.out.println("Nombres pairs entre 1 et " + n + " : " + compteur);
    }
}