// S3_Exo1_EstPalindrome.java
// Énoncé : Crée estPalindrome(String s) → boolean.
//          Crée nettoyer(String s) → String qui enlève espaces et met en minuscules.
//          Crée afficherResultat(String s) qui combine les deux.
//          Teste avec "kayak", "Radar", "A man a plan a canal Panama".

public class S3_Exo1_EstPalindrome {

    static String nettoyer(String s) {
        return s.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    static boolean estPalindrome(String s) {
        String net = nettoyer(s);
        int n = net.length();
        for (int i = 0; i < n / 2; i++) {
            if (net.charAt(i) != net.charAt(n - 1 - i)) return false;
        }
        return true;
    }

    static void afficherResultat(String s) {
        System.out.printf("%-35s → %s%n", "\"" + s + "\"",
            estPalindrome(s) ? "Palindrome !" : "Pas palindrome");
    }

    public static void main(String[] args) {
        afficherResultat("kayak");
        afficherResultat("Radar");
        afficherResultat("Java");
        afficherResultat("A man a plan a canal Panama");
        afficherResultat("Epitech");
    }
}