// S2_Exo4_TriangleRectangle.java
// Énoncé : Affiche un triangle rectangle de hauteur N.
//          Avec des espaces à gauche pour l'aligner à droite.
//          N=4 :
//             *
//            **
//           ***
//          ****

import java.util.Scanner;

public class S2_Exo4_TriangleRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hauteur : ");
        int n = sc.nextInt();

        for (int ligne = 1; ligne <= n; ligne++) {
            for (int esp = 0; esp < n - ligne; esp++) System.out.print(" ");
            for (int col = 0; col < ligne; col++)     System.out.print("*");
            System.out.println();
        }
    }
}