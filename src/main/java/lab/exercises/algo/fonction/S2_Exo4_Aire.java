// S2_Exo4_Aire.java
// Énoncé : Crée TROIS méthodes aire() surchargées :
//          aire(double rayon)              → aire du cercle
//          aire(double largeur, double hauteur) → aire du rectangle
//          aire(double base, double hauteur, boolean triangle) → aire triangle
//          COMPRENDS : même nom, paramètres différents → Java choisit
//          automatiquement laquelle appeler.

public class S2_Exo4_Aire {

    static double aire(double rayon) {
        return Math.PI * rayon * rayon;
    }

    static double aire(double largeur, double hauteur) {
        return largeur * hauteur;
    }

    static double aire(double base, double hauteur, boolean triangle) {
        return triangle ? base * hauteur / 2 : base * hauteur;
    }

    public static void main(String[] args) {
        System.out.printf("Cercle r=5       : %.4f%n", aire(5));
        System.out.printf("Rectangle 4x6    : %.4f%n", aire(4, 6));
        System.out.printf("Triangle b=4 h=6 : %.4f%n", aire(4, 6, true));
    }
}