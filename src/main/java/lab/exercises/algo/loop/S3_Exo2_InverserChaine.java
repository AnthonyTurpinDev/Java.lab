// S3_Exo2_InverserChaine.java
// Énoncé : Lis un mot et affiche-le à l'envers.
//          INTERDIT : StringBuilder.reverse().
//          Parcours la chaîne de la fin vers le début.

import java.util.Scanner;

public class S3_Exo2_InverserChaine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mot : ");
        String mot = sc.next();

        String inverse = "";
        for (int i = mot.length() - 1; i >= 0; i--) {
            inverse += mot.charAt(i);
        }

        System.out.println("Inverse : " + inverse);
        System.out.println("Palindrome : " + mot.equalsIgnoreCase(inverse));
    }
}