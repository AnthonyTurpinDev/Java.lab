// S1_Exo12_TriangleEtoiles.java
// Énoncé : Lis N et affiche un triangle rectangle d'étoiles de hauteur N.
//          Ligne 1 : *
//          Ligne 2 : **
//          ...
//          Ligne N : ****...* (N étoiles)
//          C'est ta première boucle imbriquée : for dans un for.

import java.util.Scanner;

public class S1_Exo12_TriangleEtoiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hauteur : ");
        int n = sc.nextInt();

        for (int ligne = 1; ligne <= n; ligne++) {
            for (int col = 1; col <= ligne; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}