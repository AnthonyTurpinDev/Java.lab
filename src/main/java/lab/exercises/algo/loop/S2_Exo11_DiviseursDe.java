// S2_Exo11_DiviseursDe.java
// Énoncé : Lis N et affiche tous ses diviseurs.
//          Indique aussi combien il en a.
//          Ex : N=12 → 1 2 3 4 6 12 (6 diviseurs)

import java.util.Scanner;

public class S2_Exo11_DiviseursDe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();

        int count = 0;
        System.out.print("Diviseurs de " + n + " : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nNombre de diviseurs : " + count);
    }
}