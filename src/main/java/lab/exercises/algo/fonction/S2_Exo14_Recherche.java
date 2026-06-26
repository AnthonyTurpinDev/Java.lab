// S2_Exo14_Recherche.java
// Énoncé : Crée rechercheLineaire(int[] tab, int val) → int
//          (retourne l'index ou -1 si absent)
//          Crée contient(int[] tab, int val) → boolean (utilise rechercheLineaire)
//          Crée compterOccurrences(int[] tab, int val) → int
//          Teste tout depuis main().

public class S2_Exo14_Recherche {

    static int rechercheLineaire(int[] tab, int val) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == val) return i;
        }
        return -1;
    }

    static boolean contient(int[] tab, int val) {
        return rechercheLineaire(tab, val) != -1;
    }

    static int compterOccurrences(int[] tab, int val) {
        int count = 0;
        for (int v : tab) if (v == val) count++;
        return count;
    }

    public static void main(String[] args) {
        int[] tab = {5, 3, 8, 3, 1, 9, 3, 7, 2};
        System.out.print("Tableau : ");
        for (int v : tab) System.out.print(v + " ");
        System.out.println();

        System.out.println("Index de 8 : " + rechercheLineaire(tab, 8));
        System.out.println("Index de 6 : " + rechercheLineaire(tab, 6));
        System.out.println("Contient 9 : " + contient(tab, 9));
        System.out.println("Occurrences de 3 : " + compterOccurrences(tab, 3));
    }
}