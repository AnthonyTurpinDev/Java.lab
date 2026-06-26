package fonction;
// S1_Exo2_AfficherLigne.java
// Énoncé : Crée afficherLigne(int n) qui affiche une ligne de N tirets.
//          Ex : afficherLigne(5) → "-----"
//          COMPRENDS : le paramètre, c'est une variable que tu passes
//          à la fonction pour qu'elle l'utilise.

public class S1_Exo2_AfficherLigne {

    static void afficherLigne(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        afficherLigne(5);
        afficherLigne(10);
        afficherLigne(3);
    }
}