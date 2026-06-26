// Exo1_PositifNegatifZero.java
// Énoncé : Demande un entier à l'utilisateur et affiche
//          "positif", "négatif" ou "zéro" selon sa valeur.

import java.util.Scanner;

public class Exo1_PositifNegatifZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un entier : ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("positif");
        } else if (n < 0) {
            System.out.println("négatif");
        } else {
            System.out.println("zéro");
        }
    }
}