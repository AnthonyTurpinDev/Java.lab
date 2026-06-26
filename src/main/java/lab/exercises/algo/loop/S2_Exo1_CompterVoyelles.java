// S2_Exo1_CompterVoyelles.java
// Énoncé : Lis une phrase entière (avec espaces).
//          Compte et affiche le nombre de voyelles (a e i o u y).
//          Ignore la casse.

import java.util.Scanner;

public class S2_Exo1_CompterVoyelles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre une phrase : ");
        String phrase = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y') {
                count++;
            }
        }

        System.out.println("Nombre de voyelles : " + count);
    }
}