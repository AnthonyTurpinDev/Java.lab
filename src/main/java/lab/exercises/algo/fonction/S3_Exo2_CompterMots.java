// S3_Exo2_CompterMots.java
// Énoncé : Crée compterMots(String phrase) → int.
//          Crée compterVoyelles(String phrase) → int.
//          Crée compterConsonnes(String phrase) → int.
//          Crée motLePlusLong(String phrase) → String.
//          Affiche toutes ces stats pour une phrase saisie.

import java.util.Scanner;

public class S3_Exo2_CompterMots {

    static int compterMots(String phrase) {
        String trimmed = phrase.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }

    static boolean estVoyelle(char c) {
        c = Character.toLowerCase(c);
        return "aeiouy".indexOf(c) != -1;
    }

    static int compterVoyelles(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (estVoyelle(phrase.charAt(i))) count++;
        }
        return count;
    }

    static int compterConsonnes(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (Character.isLetter(c) && !estVoyelle(c)) count++;
        }
        return count;
    }

    static String motLePlusLong(String phrase) {
        String[] mots = phrase.trim().split("\\s+");
        String plusLong = "";
        for (String mot : mots) {
            if (mot.length() > plusLong.length()) plusLong = mot;
        }
        return plusLong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phrase : ");
        String phrase = sc.nextLine();

        System.out.println("Mots            : " + compterMots(phrase));
        System.out.println("Voyelles        : " + compterVoyelles(phrase));
        System.out.println("Consonnes       : " + compterConsonnes(phrase));
        System.out.println("Mot le plus long: " + motLePlusLong(phrase));
    }
}