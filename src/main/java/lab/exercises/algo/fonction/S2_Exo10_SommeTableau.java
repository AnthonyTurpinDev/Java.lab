// S2_Exo10_SommeTableau.java
// Énoncé : Crée somme(int[] tab) → int
//          Crée moyenne(int[] tab) → double (utilise somme)
//          Crée afficherTab(int[] tab) → void
//          COMPRENDS : un tableau passé en paramètre — Java passe
//          la référence, pas une copie.

public class S2_Exo10_SommeTableau {

    static int somme(int[] tab) {
        int total = 0;
        for (int v : tab) total += v;
        return total;
    }

    static double moyenne(int[] tab) {
        if (tab.length == 0) return 0;
        return (double) somme(tab) / tab.length;
    }

    static void afficherTab(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] notes = {12, 15, 8, 17, 11, 14};
        afficherTab(notes);
        System.out.println("Somme   : " + somme(notes));
        System.out.printf("Moyenne : %.2f%n", moyenne(notes));
    }
}