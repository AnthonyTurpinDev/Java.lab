// Exo13_Distributeur.java
// Énoncé : L'utilisateur choisit un produit (1=Eau 1€, 2=Jus 1.5€,
//          3=Soda 2€). Il entre la somme. Affiche la monnaie rendue
//          ou "Solde insuffisant".

import java.util.Scanner;

public class Exo13_Distributeur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Distributeur ===");
        System.out.println("1 - Eau     1.00€");
        System.out.println("2 - Jus     1.50€");
        System.out.println("3 - Soda    2.00€");
        System.out.print("Ton choix : ");
        int choix = sc.nextInt();

        double prix;
        String produit;

        switch (choix) {
            case 1: prix = 1.0; produit = "Eau"; break;
            case 2: prix = 1.5; produit = "Jus"; break;
            case 3: prix = 2.0; produit = "Soda"; break;
            default:
                System.out.println("Choix invalide.");
                return;
        }

        System.out.print("Somme insérée (€) : ");
        double somme = sc.nextDouble();

        if (somme >= prix) {
            System.out.println("Produit : " + produit);
            System.out.printf("Monnaie rendue : %.2f€%n", somme - prix);
        } else {
            System.out.printf("Solde insuffisant. Il manque %.2f€%n", prix - somme);
        }
    }
}