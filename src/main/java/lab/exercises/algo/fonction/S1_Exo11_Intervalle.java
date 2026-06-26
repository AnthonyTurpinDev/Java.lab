// S1_Exo11_Intervalle.java
// Énoncé : Crée min(int a, int b) → int
//          Crée max(int a, int b) → int
//          Crée estDansIntervalle(int n, int a, int b) → boolean
//          qui utilise min et max pour vérifier si n est entre a et b.
//          Crée afficherIntervalle(int a, int b, int n) qui affiche tout.

public class S1_Exo11_Intervalle {

    static int min(int a, int b) { return a <= b ? a : b; }
    static int max(int a, int b) { return a >= b ? a : b; }

    static boolean estDansIntervalle(int n, int a, int b) {
        return n >= min(a, b) && n <= max(a, b);
    }

    static void afficherIntervalle(int a, int b, int n) {
        System.out.println("Intervalle [" + min(a,b) + ", " + max(a,b) + "]");
        System.out.println(n + " dedans ? " + estDansIntervalle(n, a, b));
    }

    public static void main(String[] args) {
        afficherIntervalle(5, 15, 10);
        afficherIntervalle(5, 15, 3);
        afficherIntervalle(15, 5, 15);
    }
}