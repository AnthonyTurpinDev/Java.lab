// S2_Exo12_InverserTableau.java
// Énoncé : Crée inverser(int[] tab) → int[] qui retourne un NOUVEAU tableau
//          avec les éléments dans l'ordre inverse.
//          Crée inverserEnPlace(int[] tab) qui modifie le tableau original.
//          COMPRENDS la différence : l'un retourne un nouveau tableau,
//          l'autre modifie celui passé en paramètre.

public class S2_Exo12_InverserTableau {

    static int[] inverser(int[] tab) {
        int[] res = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            res[i] = tab[tab.length - 1 - i];
        }
        return res;
    }

    static void inverserEnPlace(int[] tab) {
        for (int i = 0; i < tab.length / 2; i++) {
            int tmp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = tmp;
        }
    }

    static void afficher(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.print("Original : "); afficher(tab);

        int[] inverse = inverser(tab);
        System.out.print("Inversé  : "); afficher(inverse);
        System.out.print("Original intact : "); afficher(tab);

        inverserEnPlace(tab);
        System.out.print("En place : "); afficher(tab);
    }
}