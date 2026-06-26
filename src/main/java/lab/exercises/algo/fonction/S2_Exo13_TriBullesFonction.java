// S2_Exo13_TriBullesFonction.java
// Énoncé : Crée triBulles(int[] tab) → void (trie en place)
//          Crée echanger(int[] tab, int i, int j) → void
//          Crée estTrie(int[] tab) → boolean
//          Crée copierTableau(int[] tab) → int[]
//          Trie une copie du tableau pour garder l'original intact.

public class S2_Exo13_TriBullesFonction {

    static void echanger(int[] tab, int i, int j) {
        int tmp = tab[i]; tab[i] = tab[j]; tab[j] = tmp;
    }

    static void triBulles(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j+1]) echanger(tab, j, j+1);
            }
        }
    }

    static boolean estTrie(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i+1]) return false;
        }
        return true;
    }

    static int[] copier(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) copie[i] = tab[i];
        return copie;
    }

    static void afficher(int[] tab) {
        for (int v : tab) System.out.print(v + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] original = {64, 34, 25, 12, 22, 11, 90};
        int[] copie = copier(original);

        System.out.print("Avant : "); afficher(copie);
        System.out.println("Trié ? " + estTrie(copie));

        triBulles(copie);

        System.out.print("Après : "); afficher(copie);
        System.out.println("Trié ? " + estTrie(copie));
        System.out.print("Original : "); afficher(original);
    }
}