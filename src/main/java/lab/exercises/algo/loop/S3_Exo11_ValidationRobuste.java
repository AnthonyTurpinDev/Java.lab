// S3_Exo11_ValidationRobuste.java
// Énoncé : Crée une fonction de saisie robuste.
//          Demande un entier entre min et max.
//          Redemande TANT QUE la valeur est hors plage.
//          Affiche un message d'erreur précis à chaque fois.
//          C'est exactement ce qu'Epitech attend dans tout programme interactif.

import java.util.Scanner;

public class S3_Exo11_ValidationRobuste {

    static Scanner sc = new Scanner(System.in);

    static int lireEntierEntre(String message, int min, int max) {
        int valeur;
        do {
            System.out.print(message + " [" + min + "-" + max + "] : ");
            valeur = sc.nextInt();
            if (valeur < min || valeur > max) {
                System.out.println("  Erreur : valeur hors plage. Réessaie.");
            }
        } while (valeur < min || valeur > max);
        return valeur;
    }

    public static void main(String[] args) {
        int age   = lireEntierEntre("Ton âge", 1, 120);
        int note  = lireEntierEntre("Ta note", 0, 20);
        int mois  = lireEntierEntre("Mois de naissance", 1, 12);

        System.out.println("\nSaisies validées :");
        System.out.println("Âge : " + age + " | Note : " + note + " | Mois : " + mois);
    }
}