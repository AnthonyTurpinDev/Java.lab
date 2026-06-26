package fonction;
// S1_Exo10_InfosNombre.java
// Énoncé : Crée estPositif(int n) → boolean
//          Crée estPair(int n) → boolean
//          Crée estDivisiblePar3(int n) → boolean
//          Crée afficherInfos(int n) qui appelle les 3 et affiche tout.
//          COMPRENDS : découper = chaque fonction fait UNE chose.

public class S1_Exo10_InfosNombre {

    static boolean estPositif(int n)        { return n > 0; }
    static boolean estPair(int n)           { return n % 2 == 0; }
    static boolean estDivisiblePar3(int n)  { return n % 3 == 0; }

    static void afficherInfos(int n) {
        System.out.println("=== Infos sur " + n + " ===");
        System.out.println("Positif        : " + estPositif(n));
        System.out.println("Pair           : " + estPair(n));
        System.out.println("Div. par 3     : " + estDivisiblePar3(n));
    }

    public static void main(String[] args) {
        afficherInfos(12);
        afficherInfos(-7);
        afficherInfos(0);
    }
}