// S3_Exo3_ROT13.java
// Énoncé : Le chiffrement ROT13 décale chaque lettre de 13 positions.
//          A→N, B→O, ... Z→M. Les non-lettres restent inchangés.
//          ROT13 appliqué deux fois redonne le texte original.

import java.util.Scanner;

public class S3_Exo3_ROT13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texte : ");
        String texte = sc.nextLine();

        String resultat = "";
        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);
            if      (c >= 'a' && c <= 'z') resultat += (char)('a' + (c - 'a' + 13) % 26);
            else if (c >= 'A' && c <= 'Z') resultat += (char)('A' + (c - 'A' + 13) % 26);
            else                           resultat += c;
        }

        System.out.println("ROT13 : " + resultat);
    }
}