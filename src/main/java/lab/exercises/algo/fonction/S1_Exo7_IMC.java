// S1_Exo7_IMC.java
// Énoncé : Crée calculerIMC(double poids, double taille) → double.
//          IMC = poids / (taille * taille)
//          Crée getCategorie(double imc) → String qui retourne
//          "Insuffisance pondérale", "Normal", "Surpoids" ou "Obésité".
//          main() appelle les deux et affiche le résultat.

public class S1_Exo7_IMC {

    static double calculerIMC(double poids, double taille) {
        return poids / (taille * taille);
    }

    static String getCategorie(double imc) {
        if (imc < 18.5) return "Insuffisance pondérale";
        if (imc < 25.0) return "Normal";
        if (imc < 30.0) return "Surpoids";
        return "Obésité";
    }

    public static void main(String[] args) {
        double poids = 70.0;
        double taille = 1.75;
        double imc = calculerIMC(poids, taille);

        System.out.printf("IMC : %.2f%n", imc);
        System.out.println("Catégorie : " + getCategorie(imc));
    }
}