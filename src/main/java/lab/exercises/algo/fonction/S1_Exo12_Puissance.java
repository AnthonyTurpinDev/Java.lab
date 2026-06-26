// S1_Exo12_Puissance.java
// Énoncé : Crée puissance(double base, int exp) → double.
//          Gère exp négatif et exp = 0.
//          Crée afficherPuissances(double base, int max) qui affiche
//          base^0 jusqu'à base^max en appelant puissance().

public class S1_Exo12_Puissance {

    static double puissance(double base, int exp) {
        if (exp == 0) return 1;
        double res = 1;
        int absExp = Math.abs(exp);
        for (int i = 0; i < absExp; i++) res *= base;
        return exp < 0 ? 1.0 / res : res;
    }

    static void afficherPuissances(double base, int max) {
        System.out.println("Puissances de " + base + " :");
        for (int i = 0; i <= max; i++) {
            System.out.printf("  %.1f^%d = %.4f%n", base, i, puissance(base, i));
        }
    }

    public static void main(String[] args) {
        afficherPuissances(2, 8);
        System.out.println();
        afficherPuissances(3, 5);
        System.out.println();
        System.out.println("2^-3 = " + puissance(2, -3));
    }
}