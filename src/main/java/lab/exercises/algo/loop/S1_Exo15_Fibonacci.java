// S1_Exo15_Fibonacci.java
// Énoncé : Affiche la suite de Fibonacci jusqu'à ce que le terme dépasse N.
//          0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
//          Chaque terme = somme des deux précédents.

import java.util.Scanner;

public class S1_Exo15_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Afficher Fibonacci jusqu'à N : ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}