package condition;
// Exo6_PretBancaire.java
// Énoncé : Un prêt est accordé si :
//   - Salaire >= 1500€ ET ancienneté >= 2 ans
//   - OU salaire >= 3000€ (peu importe l'ancienneté)
// Affiche "Prêt accordé" ou "Prêt refusé" avec le motif.

import java.util.Scanner;

public class Exo6_PretBancaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salaire mensuel (€) : ");
        double salaire = sc.nextDouble();
        System.out.print("Ancienneté (années) : ");
        int anciennete = sc.nextInt();

        if (salaire >= 3000 || (salaire >= 1500 && anciennete >= 2)) {
            System.out.println("Prêt accordé !");
        } else {
            System.out.println("Prêt refusé.");
            if (salaire < 1500) {
                System.out.println("  Motif : salaire insuffisant (< 1500€)");
            } else {
                System.out.println("  Motif : ancienneté insuffisante (< 2 ans)");
            }
        }
    }
}