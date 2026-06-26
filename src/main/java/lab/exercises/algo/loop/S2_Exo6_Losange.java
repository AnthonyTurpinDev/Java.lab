// S2_Exo6_Losange.java
// Énoncé : Affiche un losange de largeur maximale 2*N-1.
//          N=3 :
//            *
//           ***
//          *****
//           ***
//            *
//          DÉFI : combine triangle + triangle inversé.

import java.util.Scanner;

public class S2_Exo6_Losange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int e = 0; e < n - i; e++) System.out.print(" ");
            for (int s = 0; s < 2*i-1; s++) System.out.print("*");
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int e = 0; e < n - i; e++) System.out.print(" ");
            for (int s = 0; s < 2*i-1; s++) System.out.print("*");
            System.out.println();
        }
    }
}