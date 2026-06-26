// S3_Exo9_PGCD.java
// Énoncé : Calcule le Plus Grand Commun Diviseur de deux entiers.
//          Algorithme d'Euclide : PGCD(a, b) = PGCD(b, a % b)
//          Répète jusqu'à b = 0, alors PGCD = a.
//          Ex : PGCD(48, 18) = 6

import java.util.Scanner;

public class S3_Exo9_PGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : "); int a = sc.nextInt();
        System.out.print("b : "); int b = sc.nextInt();

        int x = Math.abs(a), y = Math.abs(b);

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("PGCD(" + a + ", " + b + ") = " + x);
        System.out.println("PPCM(" + a + ", " + b + ") = " + (Math.abs(a * b) / x));
    }
}