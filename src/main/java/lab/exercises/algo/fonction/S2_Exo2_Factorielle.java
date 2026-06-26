// S2_Exo2_Factorielle.java
// Énoncé : Crée factorielle(int n) → long (itératif).
//          Crée afficherFactorielles(int max) qui affiche de 0! à max!.
//          PIÈGE : 0! = 1. Utilise long pas int (20! dépasse int).

public class S2_Exo2_Factorielle {

    static long factorielle(int n) {
        if (n < 0) return -1;
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    static void afficherFactorielles(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i + "! = " + factorielle(i));
        }
    }

    public static void main(String[] args) {
        afficherFactorielles(15);
    }
}