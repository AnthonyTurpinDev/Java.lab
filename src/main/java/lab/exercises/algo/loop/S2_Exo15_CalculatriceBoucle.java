// S2_Exo15_CalculatriceBoucle.java
// Énoncé : Une calculatrice qui tourne en boucle.
//          L'utilisateur entre deux nombres et un opérateur.
//          Il tape "q" comme opérateur pour quitter.
//          Affiche un historique du nombre d'opérations réalisées.

import java.util.Scanner;

public class S2_Exo15_CalculatriceBoucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operations = 0;

        System.out.println("=== Calculatrice (q pour quitter) ===");

        while (true) {
            System.out.print("Nombre 1 : ");
            double a = sc.nextDouble();
            System.out.print("Opérateur (+,-,*,/) ou q : ");
            String op = sc.next();

            if (op.equals("q")) break;

            System.out.print("Nombre 2 : ");
            double b = sc.nextDouble();

            double res = 0;
            boolean valide = true;

            switch (op) {
                case "+": res = a + b; break;
                case "-": res = a - b; break;
                case "*": res = a * b; break;
                case "/":
                    if (b == 0) { System.out.println("Division par zéro !"); valide = false; }
                    else res = a / b;
                    break;
                default: System.out.println("Opérateur inconnu."); valide = false;
            }

            if (valide) {
                System.out.printf("= %.4f%n", res);
                operations++;
            }
        }

        System.out.println("Session terminée. " + operations + " opération(s) effectuée(s).");
    }
}