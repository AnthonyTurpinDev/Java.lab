// S3_Exo10_Sentinelle.java
// Énoncé : Un programme de caisse. L'utilisateur entre des prix.
//          Il tape -1 pour terminer (valeur sentinelle).
//          Affiche le total, le nombre d'articles et le prix moyen.
//          IMPORTANT : c'est le pattern classique Epitech pour lire
//          une quantité inconnue de données.

import java.util.Scanner;

public class S3_Exo10_Sentinelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int articles = 0;

        System.out.println("=== Caisse === (-1 pour terminer)");

        while (true) {
            System.out.print("Prix article : ");
            double prix = sc.nextDouble();
            if (prix == -1) break;
            if (prix < 0)  { System.out.println("Prix invalide."); continue; }
            total += prix;
            articles++;
        }

        if (articles == 0) {
            System.out.println("Aucun article.");
        } else {
            System.out.printf("Total    : %.2f€%n", total);
            System.out.println("Articles : " + articles);
            System.out.printf("Moyenne  : %.2f€%n", total / articles);
        }
    }
}