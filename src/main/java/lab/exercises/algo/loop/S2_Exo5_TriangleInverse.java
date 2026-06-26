// S2_Exo5_TriangleInverse.java
// Énoncé : Affiche un triangle inversé de hauteur N.
//          N=4 :
//          ****
//           ***
//            **
//             *

import java.util.Scanner;

public class S2_Exo5_TriangleInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hauteur : ");
        int n = sc.nextInt();

        for (int ligne = n; ligne >= 1; ligne--) {
            for (int esp = 0; esp < n - ligne; esp++) System.out.print(" ");
            for (int col = 0; col < ligne; col++)     System.out.print("*");
            System.out.println();
        }
    }
}