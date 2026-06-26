// S2_Exo3_NombrePremier.java
// Énoncé : Crée estPremier(int n) → boolean.
//          Crée afficherPremiers(int max) qui affiche tous les nombres
//          premiers jusqu'à max en utilisant estPremier().
//          Crée compterPremiers(int max) → int.

public class S2_Exo3_NombrePremier {

    static boolean estPremier(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int compterPremiers(int max) {
        int count = 0;
        for (int i = 2; i <= max; i++) {
            if (estPremier(i)) count++;
        }
        return count;
    }

    static void afficherPremiers(int max) {
        System.out.print("Premiers jusqu'à " + max + " : ");
        for (int i = 2; i <= max; i++) {
            if (estPremier(i)) System.out.print(i + " ");
        }
        System.out.println("\nTotal : " + compterPremiers(max));
    }

    public static void main(String[] args) {
        afficherPremiers(50);
        System.out.println("17 est premier ? " + estPremier(17));
        System.out.println("25 est premier ? " + estPremier(25));
    }
}