// S1_Exo5_Max.java
// Énoncé : Crée max(int a, int b) qui retourne le plus grand des deux.
//          Puis crée afficherMax(int a, int b) qui l'utilise pour afficher.
//          COMPRENDS : une fonction peut appeler une autre fonction.

public class S1_Exo5_Max {

    static int max(int a, int b) {
        if (a >= b) return a;
        return b;
    }

    static void afficherMax(int a, int b) {
        System.out.println("Max(" + a + ", " + b + ") = " + max(a, b));
    }

    public static void main(String[] args) {
        afficherMax(3, 7);
        afficherMax(100, 42);
        afficherMax(5, 5);

        int m = max(12, 8);
        System.out.println("Le plus grand est : " + m);
    }
}