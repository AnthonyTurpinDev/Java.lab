// Exo10_Palindrome.java
// Énoncé : Un palindrome se lit pareil dans les deux sens (ex: "kayak").
//          Lis un mot, convertis en minuscules, puis vérifie
//          si c'est un palindrome avec une condition.
//          INTERDIT d'utiliser StringBuilder.reverse().

import java.util.Scanner;

public class Exo10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un mot : ");
        String mot = sc.next().toLowerCase();

        String inverse = "";
        for (int i = mot.length() - 1; i >= 0; i--) {
            inverse += mot.charAt(i);
        }

        if (mot.equals(inverse)) {
            System.out.println("\"" + mot + "\" est un palindrome !");
        } else {
            System.out.println("\"" + mot + "\" n'est pas un palindrome.");
        }
    }
}
