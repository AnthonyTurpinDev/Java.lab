// S3_Exo6_InverserRec.java
// Énoncé : Crée inverserRec(String s) → String en récursion pure.
//          Cas de base : s vide ou 1 char → return s
//          Cas récursif : dernier char + inverserRec(s sans dernier char)
//          Crée estPalindromeRec(String s) → boolean en récursion.

public class S3_Exo6_InverserRec {

    static String inverserRec(String s) {
        if (s.length() <= 1) return s;
        return s.charAt(s.length() - 1) + inverserRec(s.substring(0, s.length() - 1));
    }

    static boolean estPalindromeRec(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return estPalindromeRec(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String[] mots = {"Java", "kayak", "Epitech", "radar", "hello"};
        for (String mot : mots) {
            System.out.printf("%-10s → inverse: %-10s | palindrome: %s%n",
                mot, inverserRec(mot), estPalindromeRec(mot.toLowerCase()));
        }
    }
}