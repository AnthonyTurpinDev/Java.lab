// Exo11_CategoriserMot.java
// Énoncé : Lis une chaîne de caractères.
//          <= 3 lettres  → "mot court"
//          4 à 7 lettres → "mot moyen"
//          >= 8 lettres  → "mot long"
//          Affiche aussi le nombre de voyelles dans le mot.

import java.util.Scanner;

public class Exo11_CategoriserMot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un mot : ");
        String mot = sc.next().toLowerCase();
        int len = mot.length();

        String categorie;
        if (len <= 3)      categorie = "mot court";
        else if (len <= 7) categorie = "mot moyen";
        else               categorie = "mot long";

        int voyelles = 0;
        for (int i = 0; i < len; i++) {
            char c = mot.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                voyelles++;
            }
        }

        System.out.println("\"" + mot + "\" → " + categorie + " (" + len + " lettres, " + voyelles + " voyelles)");
    }
}
