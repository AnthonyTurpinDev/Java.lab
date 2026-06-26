// Exo5_ValidateurMDP.java
// Énoncé : Un mot de passe est valide si :
//   1. Au moins 8 caractères
//   2. Contient au moins un chiffre
//   3. Contient au moins une majuscule
// Affiche "Mot de passe valide" ou la liste des règles non respectées.

import java.util.Scanner;

public class Exo5_ValidateurMDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mot de passe : ");
        String mdp = sc.next();

        boolean assezLong    = mdp.length() >= 8;
        boolean aChiffre     = mdp.matches(".*[0-9].*");
        boolean aMajuscule   = mdp.matches(".*[A-Z].*");

        if (assezLong && aChiffre && aMajuscule) {
            System.out.println("Mot de passe valide ✓");
        } else {
            System.out.println("Mot de passe invalide :");
            if (!assezLong)  System.out.println("  - Minimum 8 caractères");
            if (!aChiffre)   System.out.println("  - Doit contenir un chiffre");
            if (!aMajuscule) System.out.println("  - Doit contenir une majuscule");
        }
    }
}