// Exo8_Calculatrice.java
// Énoncé : Lis deux nombres et un opérateur (+, -, *, /).
//          Affiche le résultat. Gère la division par zéro.

import java.util.Scanner;

public class Exo8_Calculatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Premier nombre : ");
        double a = sc.nextDouble();
        System.out.print("Opérateur (+, -, *, /) : ");
        String op = sc.next();
        System.out.print("Deuxième nombre : ");
        double b = sc.nextDouble();

        switch (op) {
            case "+": System.out.println("Résultat : " + (a + b)); break;
            case "-": System.out.println("Résultat : " + (a - b)); break;
            case "*": System.out.println("Résultat : " + (a * b)); break;
            case "/":
                if (b == 0) {
                    System.out.println("Erreur : division par zéro !");
                } else {
                    System.out.println("Résultat : " + (a / b));
                }
                break;
            default: System.out.println("Opérateur inconnu");
        }
    }
}