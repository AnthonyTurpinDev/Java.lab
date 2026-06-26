// S2_Exo6_MaxSurcharge.java
// Énoncé : Crée max(int a, int b) → int
//          Crée max(int a, int b, int c) → int (qui utilise max(a,b))
//          Crée max(int a, int b, int c, int d) → int (qui utilise max(a,b,c))
//          COMPRENDS : on réutilise les versions plus simples —
//          c'est le principe DRY (Don't Repeat Yourself).

public class S2_Exo6_MaxSurcharge {

    static int max(int a, int b) {
        return a >= b ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    public static void main(String[] args) {
        System.out.println("max(3,7)          = " + max(3, 7));
        System.out.println("max(3,7,2)        = " + max(3, 7, 2));
        System.out.println("max(3,7,2,9)      = " + max(3, 7, 2, 9));
        System.out.println("max(100,42,77,88) = " + max(100, 42, 77, 88));
    }
}