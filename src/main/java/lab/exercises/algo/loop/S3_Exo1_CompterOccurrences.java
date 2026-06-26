// S3_Exo1_CompterOccurrences.java
// Énoncé : Lis une phrase et un caractère.
//          Compte combien de fois ce caractère apparaît (insensible à la casse).

import java.util.Scanner;

public class S3_Exo1_CompterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phrase : ");
        String phrase = sc.nextLine().toLowerCase();
        System.out.print("Caractère à chercher : ");
        char cible = sc.next().toLowerCase().charAt(0);

        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == cible) count++;
        }

        System.out.println("'" + cible + "' apparaît " + count + " fois.");
    }
}