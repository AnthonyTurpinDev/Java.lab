// S1_Exo1_PremiereFonction.java
// Énoncé : Crée une fonction afficherBonjour() qui affiche "Bonjour !".
//          Appelle-la 3 fois depuis main().
//          COMPRENDS : une fonction void ne retourne rien.
//          Syntaxe : static void nomFonction() { ... }

public class S1_Exo1_PremiereFonction {

    static void afficherBonjour() {
        System.out.println("Bonjour !");
    }

    public static void main(String[] args) {
        afficherBonjour();
        afficherBonjour();
        afficherBonjour();
    }
}
