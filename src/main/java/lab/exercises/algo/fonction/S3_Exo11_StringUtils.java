// S3_Exo11_StringUtils.java
// Énoncé : Crée une bibliothèque StringUtils avec :
//          compterChar(s, c), compterMots(s), inverser(s),
//          estPalindrome(s), majuscules(s), repeter(s, n),
//          tronquer(s, maxLen) qui coupe et ajoute "..." si trop long.

public class S3_Exo11_StringUtils {

    static int compterChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) count++;
        return count;
    }

    static int compterMots(String s) {
        return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
    }

    static String inverser(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) sb.append(s.charAt(i));
        return sb.toString();
    }

    static boolean estPalindrome(String s) {
        String net = s.toLowerCase().replaceAll("[^a-z]", "");
        return net.equals(inverser(net));
    }

    static String repeter(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(s);
        return sb.toString();
    }

    static String tronquer(String s, int maxLen) {
        if (s.length() <= maxLen) return s;
        return s.substring(0, maxLen - 3) + "...";
    }

    public static void main(String[] args) {
        String test = "Bonjour tout le monde";
        System.out.println("Compter 'o'       : " + compterChar(test, 'o'));
        System.out.println("Compter mots      : " + compterMots(test));
        System.out.println("Inversé           : " + inverser(test));
        System.out.println("'kayak' palindrome: " + estPalindrome("kayak"));
        System.out.println("Répéter 'ab' x3   : " + repeter("ab", 3));
        System.out.println("Tronquer (10)     : " + tronquer(test, 10));
    }
}