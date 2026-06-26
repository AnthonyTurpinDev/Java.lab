// S1_Exo13_Calculatrice.java
// Énoncé : Crée calculer(double a, String op, double b) → double.
//          Crée estOperateurValide(String op) → boolean.
//          Crée afficherResultat(double a, String op, double b).
//          main() appelle afficherResultat avec différents calculs.
//          PIÈGE : division par zéro → retourner Double.NaN.

public class S1_Exo13_Calculatrice {

    static boolean estOperateurValide(String op) {
        return op.equals("+") || op.equals("-")
            || op.equals("*") || op.equals("/");
    }

    static double calculer(double a, String op, double b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) return Double.NaN;
                return a / b;
        }
        return Double.NaN;
    }

    static void afficherResultat(double a, String op, double b) {
        if (!estOperateurValide(op)) {
            System.out.println("Opérateur '" + op + "' invalide.");
            return;
        }
        double res = calculer(a, op, b);
        if (Double.isNaN(res)) {
            System.out.println("Erreur : division par zéro !");
        } else {
            System.out.printf("%.2f %s %.2f = %.4f%n", a, op, b, res);
        }
    }

    public static void main(String[] args) {
        afficherResultat(10, "+", 5);
        afficherResultat(10, "-", 3);
        afficherResultat(6, "*", 7);
        afficherResultat(15, "/", 4);
        afficherResultat(10, "/", 0);
        afficherResultat(5, "%", 2);
    }
}