// S3_Exo4_PuissanceRecursive.java
// Énoncé : Crée puissanceRec(double base, int exp) → double en récursion.
//          Version rapide : puissanceRapide(double base, int exp)
//          qui divise l'exposant par 2 à chaque appel (exponentiation rapide).
//          Compare les deux en termes d'appels récursifs.

public class S3_Exo4_PuissanceRecursive {

    static int appelsRec = 0;
    static int appelsRapide = 0;

    static double puissanceRec(double base, int exp) {
        appelsRec++;
        if (exp == 0) return 1;
        if (exp < 0)  return 1.0 / puissanceRec(base, -exp);
        return base * puissanceRec(base, exp - 1);
    }

    static double puissanceRapide(double base, int exp) {
        appelsRapide++;
        if (exp == 0) return 1;
        if (exp < 0)  return 1.0 / puissanceRapide(base, -exp);
        if (exp % 2 == 0) {
            double demi = puissanceRapide(base, exp / 2);
            return demi * demi;
        }
        return base * puissanceRapide(base, exp - 1);
    }

    public static void main(String[] args) {
        int exp = 16;
        appelsRec = 0; appelsRapide = 0;

        double r1 = puissanceRec(2, exp);
        double r2 = puissanceRapide(2, exp);

        System.out.printf("2^%d = %.0f%n", exp, r1);
        System.out.println("Appels récursion simple : " + appelsRec);
        System.out.println("Appels récursion rapide : " + appelsRapide);
    }
}