// S3_Exo12_ArrayUtils.java
// Énoncé : Crée une bibliothèque ArrayUtils avec :
//          afficher(int[]), copier(int[]), remplir(int[], int),
//          contient(int[], int), compterOccurrences(int[], int),
//          supprimer(int[], int index) → int[] (retourne nouveau tableau).

public class S3_Exo12_ArrayUtils {

    static void afficher(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    static int[] copier(int[] tab) {
        int[] c = new int[tab.length];
        for (int i = 0; i < tab.length; i++) c[i] = tab[i];
        return c;
    }

    static void remplir(int[] tab, int val) {
        for (int i = 0; i < tab.length; i++) tab[i] = val;
    }

    static boolean contient(int[] tab, int val) {
        for (int v : tab) if (v == val) return true;
        return false;
    }

    static int compterOccurrences(int[] tab, int val) {
        int count = 0;
        for (int v : tab) if (v == val) count++;
        return count;
    }

    static int[] supprimer(int[] tab, int index) {
        if (index < 0 || index >= tab.length) return copier(tab);
        int[] res = new int[tab.length - 1];
        for (int i = 0, j = 0; i < tab.length; i++) {
            if (i != index) res[j++] = tab[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] tab = {5, 3, 8, 3, 1, 9, 3};
        afficher(tab);
        System.out.println("Contient 8   : " + contient(tab, 8));
        System.out.println("Contient 7   : " + contient(tab, 7));
        System.out.println("Occurrences 3: " + compterOccurrences(tab, 3));
        System.out.print("Sans index 2 : "); afficher(supprimer(tab, 2));
        System.out.print("Original     : "); afficher(tab);
    }
}