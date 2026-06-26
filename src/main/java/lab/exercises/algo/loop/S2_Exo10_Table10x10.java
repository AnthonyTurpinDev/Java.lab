// S2_Exo10_Table10x10.java
// Énoncé : Affiche la table de multiplication complète de 1 à 10.
//          Format aligné en colonnes avec printf.
//          C'est le test ultime des boucles imbriquées.

public class S2_Exo10_Table10x10 {
    public static void main(String[] args) {
        System.out.print("    ");
        for (int i = 1; i <= 10; i++) System.out.printf("%4d", i);
        System.out.println("\n    " + "----".repeat(10));

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%3d|", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}