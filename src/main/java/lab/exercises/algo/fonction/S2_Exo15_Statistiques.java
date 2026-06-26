// S2_Exo15_Statistiques.java
// Énoncé : Crée un ensemble de fonctions statistiques sur int[] :
//          somme, moyenne, min, max, etendue (max-min), variance, ecartType.
//          Crée afficherStats(int[] tab) qui les appelle toutes.
//          C'est le projet final semaine 2 — tout en fonctions propres.

public class S2_Exo15_Statistiques {

    static int somme(int[] tab) {
        int s = 0; for (int v : tab) s += v; return s;
    }

    static double moyenne(int[] tab) {
        return (double) somme(tab) / tab.length;
    }

    static int min(int[] tab) {
        int m = tab[0]; for (int v : tab) if (v < m) m = v; return m;
    }

    static int max(int[] tab) {
        int m = tab[0]; for (int v : tab) if (v > m) m = v; return m;
    }

    static int etendue(int[] tab) {
        return max(tab) - min(tab);
    }

    static double variance(int[] tab) {
        double moy = moyenne(tab);
        double sommeCarres = 0;
        for (int v : tab) sommeCarres += (v - moy) * (v - moy);
        return sommeCarres / tab.length;
    }

    static double ecartType(int[] tab) {
        return Math.sqrt(variance(tab));
    }

    static void afficherStats(int[] tab) {
        System.out.print("Tableau : ");
        for (int v : tab) System.out.print(v + " ");
        System.out.println();
        System.out.println("Somme     : " + somme(tab));
        System.out.printf( "Moyenne   : %.2f%n", moyenne(tab));
        System.out.println("Min       : " + min(tab));
        System.out.println("Max       : " + max(tab));
        System.out.println("Étendue   : " + etendue(tab));
        System.out.printf( "Variance  : %.2f%n", variance(tab));
        System.out.printf( "Écart-type: %.2f%n", ecartType(tab));
    }

    public static void main(String[] args) {
        int[] notes = {12, 17, 8, 14, 11, 15, 9, 13};
        afficherStats(notes);
    }
}