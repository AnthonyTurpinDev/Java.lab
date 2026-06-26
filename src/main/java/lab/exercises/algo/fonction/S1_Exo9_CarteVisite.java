// S1_Exo9_CarteVisite.java
// Énoncé : Crée afficherCarteVisite(String nom, String prenom,
//          int age, String metier).
//          Affiche une carte de visite formatée dans un cadre ASCII.
//          Crée aussi afficherSeparateur(int largeur) pour les tirets.

public class S1_Exo9_CarteVisite {

    static void afficherSeparateur(int largeur) {
        System.out.print("+");
        for (int i = 0; i < largeur; i++) System.out.print("-");
        System.out.println("+");
    }

    static void afficherCarteVisite(String nom, String prenom, int age, String metier) {
        int larg = 30;
        afficherSeparateur(larg);
        System.out.printf("| %-28s |%n", prenom + " " + nom);
        System.out.printf("| %-28s |%n", "Age : " + age + " ans");
        System.out.printf("| %-28s |%n", "Métier : " + metier);
        afficherSeparateur(larg);
    }

    public static void main(String[] args) {
        afficherCarteVisite("Dupont", "Alice", 22, "Développeuse Java");
        System.out.println();
        afficherCarteVisite("Martin", "Bob", 35, "Étudiant Epitech");
    }
}