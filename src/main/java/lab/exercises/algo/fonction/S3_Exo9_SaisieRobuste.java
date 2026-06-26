// S3_Exo9_SaisieRobuste.java
// Énoncé : Crée lireEntierEntre(String msg, int min, int max) → int
//          Crée lireDouble(String msg) → double
//          Crée lireChaine(String msg) → String
//          Crée lireOuiNon(String msg) → boolean
//          Ces 4 fonctions sont RÉUTILISABLES dans tous tes projets Epitech.
//          Démontre leur usage avec un formulaire d'inscription fictif.

import java.util.Scanner;

public class S3_Exo9_SaisieRobuste {

    static Scanner sc = new Scanner(System.in);

    static int lireEntierEntre(String msg, int min, int max) {
        int val;
        do {
            System.out.print(msg + " [" + min + "-" + max + "] : ");
            while (!sc.hasNextInt()) { sc.next(); System.out.print("Entier requis. " + msg + " : "); }
            val = sc.nextInt();
            if (val < min || val > max) System.out.println("  Hors plage !");
        } while (val < min || val > max);
        return val;
    }

    static double lireDouble(String msg) {
        while (true) {
            System.out.print(msg + " : ");
            if (sc.hasNextDouble()) return sc.nextDouble();
            sc.next();
            System.out.println("  Nombre décimal requis !");
        }
    }

    static String lireChaine(String msg) {
        System.out.print(msg + " : ");
        return sc.next();
    }

    static boolean lireOuiNon(String msg) {
        String rep;
        do {
            System.out.print(msg + " (o/n) : ");
            rep = sc.next().toLowerCase();
        } while (!rep.equals("o") && !rep.equals("n"));
        return rep.equals("o");
    }

    public static void main(String[] args) {
        System.out.println("=== Formulaire d'inscription ===");
        String nom   = lireChaine("Nom");
        int age      = lireEntierEntre("Age", 1, 120);
        double taille = lireDouble("Taille (m)");
        boolean newsletter = lireOuiNon("S'abonner à la newsletter");

        System.out.println("\n=== Récapitulatif ===");
        System.out.println("Nom       : " + nom);
        System.out.println("Age       : " + age);
        System.out.printf( "Taille    : %.2fm%n", taille);
        System.out.println("Newsletter: " + (newsletter ? "Oui" : "Non"));
    }
}