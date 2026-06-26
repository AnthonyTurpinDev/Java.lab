// S1_Exo3_TableDe.java
// Énoncé : Crée afficherTableDe(int n) qui affiche la table de
//          multiplication de n (de 1 à 10).
//          Appelle-la pour 3, 7 et 9 depuis main().

public class S1_Exo3_TableDe {

    static void afficherTableDe(int n) {
        System.out.println("=== Table de " + n + " ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        afficherTableDe(3);
        afficherTableDe(7);
        afficherTableDe(9);
    }
}