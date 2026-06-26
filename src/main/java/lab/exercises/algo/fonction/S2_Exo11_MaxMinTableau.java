// S2_Exo11_MaxMinTableau.java
// Énoncé : Crée max(int[] tab) → int
//          Crée min(int[] tab) → int
//          Crée indexMax(int[] tab) → int (retourne l'index du max)
//          Crée indexMin(int[] tab) → int
//          Affiche toutes ces infos pour un tableau donné.

public class S2_Exo11_MaxMinTableau {

    static int max(int[] tab) {
        int m = tab[0];
        for (int v : tab) if (v > m) m = v;
        return m;
    }

    static int min(int[] tab) {
        int m = tab[0];
        for (int v : tab) if (v < m) m = v;
        return m;
    }

    static int indexMax(int[] tab) {
        int idx = 0;
        for (int i = 1; i < tab.length; i++) if (tab[i] > tab[idx]) idx = i;
        return idx;
    }

    static int indexMin(int[] tab) {
        int idx = 0;
        for (int i = 1; i < tab.length; i++) if (tab[i] < tab[idx]) idx = i;
        return idx;
    }

    public static void main(String[] args) {
        int[] tab = {34, 7, 92, 15, 63, 41, 8};
        System.out.print("Tableau : ");
        for (int v : tab) System.out.print(v + " ");
        System.out.println();
        System.out.println("Max : " + max(tab) + " à l'index " + indexMax(tab));
        System.out.println("Min : " + min(tab) + " à l'index " + indexMin(tab));
    }
}