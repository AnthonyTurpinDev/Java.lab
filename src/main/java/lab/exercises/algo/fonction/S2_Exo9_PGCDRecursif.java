// S2_Exo9_PGCDRecursif.java
// Énoncé : Crée pgcd(int a, int b) → int en récursion.
//          Algorithme d'Euclide : pgcd(a,0) = a, pgcd(a,b) = pgcd(b, a%b)
//          Crée ppcm(int a, int b) → int qui utilise pgcd.
//          Affiche pgcd et ppcm pour plusieurs paires.

public class S2_Exo9_PGCDRecursif {

    static int pgcd(int a, int b) {
        if (b == 0) return a;
        return pgcd(b, a % b);
    }

    static int ppcm(int a, int b) {
        return Math.abs(a * b) / pgcd(a, b);
    }

    static void afficherPGCDPPCM(int a, int b) {
        System.out.println("PGCD(" + a + "," + b + ") = " + pgcd(a, b)
            + " | PPCM = " + ppcm(a, b));
    }

    public static void main(String[] args) {
        afficherPGCDPPCM(48, 18);
        afficherPGCDPPCM(100, 75);
        afficherPGCDPPCM(17, 13);
        afficherPGCDPPCM(12, 8);
    }
}