// Exo2_PairImpair.java
// Énoncé : Lis un entier et dis si c'est pair ou impair.
//          Utilise l'opérateur modulo %.

import java.util.Scanner;

public class Exo2_PairImpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un entier : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " est pair");
        } else {
            System.out.println(n + " est impair");
        }
    }
}