package condition;
// Exo9_MentionTernaire.java
// Énoncé : Même logique que l'exo mention semaine 2,
//          mais TOUT doit être écrit avec l'opérateur ternaire ? :
//          Objectif : comprendre la syntaxe et les limites du ternaire.

import java.util.Scanner;

public class Exo9_MentionTernaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Note (0-20) : ");
        double note = sc.nextDouble();

        String mention = note >= 16 ? "Très bien"
                       : note >= 14 ? "Bien"
                       : note >= 12 ? "Assez bien"
                       : note >= 10 ? "Passable"
                       : "Insuffisant";

        System.out.println("Mention : " + mention);
    }
}
