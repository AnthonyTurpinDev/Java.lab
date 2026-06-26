// S2_Exo1_SommeJusquaN.java
// Énoncé : Crée sommeJusquaN(int n) → int qui retourne 1+2+...+n.
//          Crée aussi sommeFormule(int n) → int qui utilise la formule
//          mathématique n*(n+1)/2 (sans boucle).
//          Vérifie que les deux donnent le même résultat.

public class S2_Exo1_SommeJusquaN {

    static int sommeJusquaN(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) total += i;
        return total;
    }

    static int sommeFormule(int n) {
        return n * (n + 1) / 2;
    }

    static void verifier(int n) {
        int boucle  = sommeJusquaN(n);
        int formule = sommeFormule(n);
        System.out.println("Somme(1.." + n + ") = " + boucle
            + " | Formule = " + formule
            + " | OK : " + (boucle == formule));
    }

    public static void main(String[] args) {
        verifier(10);
        verifier(100);
        verifier(1000);
    }
}