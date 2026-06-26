// S2_Exo7_FactorielleRecursive.java
// Énoncé : Crée factorielleRec(int n) → long en RÉCURSION.
//          COMPRENDS la récursion :
//          - Cas de base : n == 0 → return 1
//          - Cas récursif : return n * factorielleRec(n-1)
//          La fonction S'APPELLE ELLE-MÊME avec un problème plus petit.
//          Compare avec la version itérative — même résultat !

public class S2_Exo7_FactorielleRecursive {

    static long factorielleRec(int n) {
        if (n <= 0) return 1;
        return n * factorielleRec(n - 1);
    }

    static long factorielleIter(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            long rec  = factorielleRec(i);
            long iter = factorielleIter(i);
            System.out.println(i + "! = " + rec + " | iter=" + iter + " | OK=" + (rec==iter));
        }
    }
}