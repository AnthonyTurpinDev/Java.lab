// S1_Exo15_FizzBuzzFonctions.java
// Énoncé : Réécris FizzBuzz en découpant CHAQUE logique en fonction.
//          estFizz(int n) → boolean
//          estBuzz(int n) → boolean
//          estFizzBuzz(int n) → boolean
//          getLabel(int n) → String
//          afficherFizzBuzz(int debut, int fin)
//          COMPRENDS : c'est comme ça qu'Epitech veut que tu codes.
//          Une fonction = une responsabilité.

public class S1_Exo15_FizzBuzzFonctions {

    static boolean estFizz(int n)     { return n % 3 == 0; }
    static boolean estBuzz(int n)     { return n % 5 == 0; }
    static boolean estFizzBuzz(int n) { return estFizz(n) && estBuzz(n); }

    static String getLabel(int n) {
        if (estFizzBuzz(n)) return "FizzBuzz";
        if (estFizz(n))     return "Fizz";
        if (estBuzz(n))     return "Buzz";
        return String.valueOf(n);
    }

    static void afficherFizzBuzz(int debut, int fin) {
        for (int i = debut; i <= fin; i++) {
            System.out.println(getLabel(i));
        }
    }

    public static void main(String[] args) {
        afficherFizzBuzz(1, 30);
    }
}