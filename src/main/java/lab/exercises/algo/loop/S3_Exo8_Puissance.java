// S3_Exo8_Puissance.java
// Énoncé : Calcule base^exposant sans Math.pow.
//          Gère exposant négatif → résultat = 1.0 / base^|exp|
//          Gère base^0 = 1.

import java.util.Scanner;

public class S3_Exo8_Puissance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base : ");
        double base = sc.nextDouble();
        System.out.print("Exposant : ");
        int exp = sc.nextInt();

        double resultat = 1.0;
        int absExp = Math.abs(exp);

        for (int i = 0; i < absExp; i++) {
            resultat *= base;
        }

        if (exp < 0) resultat = 1.0 / resultat;

        System.out.printf("%.4f ^ %d = %.6f%n", base, exp, resultat);
    }
}