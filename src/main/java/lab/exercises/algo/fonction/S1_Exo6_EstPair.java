package fonction;
// S1_Exo6_EstPair.java
// Énoncé : Crée estPair(int n) qui retourne true si n est pair.
//          Crée aussi estImpair(int n) qui RÉUTILISE estPair.
//          COMPRENDS : une fonction peut retourner boolean — très utile
//          dans les if : if (estPair(n)) { ... }

public class S1_Exo6_EstPair {

    static boolean estPair(int n) {
        return n % 2 == 0;
    }

    static boolean estImpair(int n) {
        return !estPair(n);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (estPair(i)) {
                System.out.println(i + " est pair");
            } else {
                System.out.println(i + " est impair");
            }
        }
    }
}
