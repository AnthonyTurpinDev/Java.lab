// S1_Exo4_Addition.java
// Énoncé : Crée addition(int a, int b) qui RETOURNE la somme.
//          COMPRENDS : return envoie une valeur à celui qui a appelé
//          la fonction. Le type avant le nom (int) = type du retour.
//          PIÈGE : void = pas de return. int = obligatoire de retourner un int.

public class S1_Exo4_Addition {

    static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultat = addition(3, 5);
        System.out.println("3 + 5 = " + resultat);
        System.out.println("10 + 7 = " + addition(10, 7));
        System.out.println("100 + 200 = " + addition(100, 200));
    }
}
