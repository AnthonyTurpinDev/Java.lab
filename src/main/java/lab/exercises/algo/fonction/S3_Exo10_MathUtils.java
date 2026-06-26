// S3_Exo10_MathUtils.java
// Énoncé : Crée une classe MathUtils avec des fonctions utilitaires :
//          abs(int n), min(a,b), max(a,b), clamp(val,min,max),
//          lerp(a, b, t) (interpolation linéaire),
//          arrondir(double d, int decimales).
//          C'est ta première "bibliothèque" — tu vas la réutiliser partout.

public class S3_Exo10_MathUtils {

    static int abs(int n)                    { return n < 0 ? -n : n; }
    static int min(int a, int b)             { return a <= b ? a : b; }
    static int max(int a, int b)             { return a >= b ? a : b; }
    static int clamp(int val, int mn, int mx){ return max(mn, min(mx, val)); }

    static double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }

    static double arrondir(double d, int decimales) {
        double facteur = Math.pow(10, decimales);
        return Math.round(d * facteur) / facteur;
    }

    static boolean estDansIntervalle(int n, int mn, int mx) {
        return n >= mn && n <= mx;
    }

    public static void main(String[] args) {
        System.out.println("abs(-5)              = " + abs(-5));
        System.out.println("min(3, 7)            = " + min(3, 7));
        System.out.println("max(3, 7)            = " + max(3, 7));
        System.out.println("clamp(15, 0, 10)     = " + clamp(15, 0, 10));
        System.out.println("clamp(-5, 0, 10)     = " + clamp(-5, 0, 10));
        System.out.printf( "lerp(0, 100, 0.25)   = %.2f%n", lerp(0, 100, 0.25));
        System.out.printf( "arrondir(3.14159, 2) = %.2f%n", arrondir(3.14159, 2));
    }
}