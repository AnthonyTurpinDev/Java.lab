// S2_Exo5_AfficherSurcharge.java
// Énoncé : Crée afficher() surchargé pour int, double, String, boolean.
//          Chaque version formate différemment l'affichage.
//          Appelle chaque version depuis main().

public class S2_Exo5_AfficherSurcharge {

    static void afficher(int n) {
        System.out.println("[int]     " + n);
    }

    static void afficher(double d) {
        System.out.printf("[double]  %.4f%n", d);
    }

    static void afficher(String s) {
        System.out.println("[String]  \"" + s + "\" (" + s.length() + " chars)");
    }

    static void afficher(boolean b) {
        System.out.println("[boolean] " + (b ? "VRAI" : "FAUX"));
    }

    public static void main(String[] args) {
        afficher(42);
        afficher(3.14159);
        afficher("Bonjour Epitech");
        afficher(true);
        afficher(false);
        afficher(0);
    }
}