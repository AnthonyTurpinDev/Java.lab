// S3_Exo3_Capitaliser.java
// Énoncé : Crée capitaliser(String s) → String
//          qui met en majuscule la première lettre de chaque mot.
//          Crée inverserCasse(String s) → String
//          qui inverse majuscule/minuscule de chaque lettre.
//          Crée censurerMot(String s, String mot) → String
//          qui remplace un mot par des étoiles.

public class S3_Exo3_Capitaliser {

    static String capitaliser(String s) {
        if (s == null || s.isEmpty()) return s;
        String[] mots = s.toLowerCase().split(" ");
        StringBuilder res = new StringBuilder();
        for (String mot : mots) {
            if (!mot.isEmpty()) {
                res.append(Character.toUpperCase(mot.charAt(0)));
                res.append(mot.substring(1));
                res.append(" ");
            }
        }
        return res.toString().trim();
    }

    static String inverserCasse(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) res.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) res.append(Character.toUpperCase(c));
            else res.append(c);
        }
        return res.toString();
    }

    static String censurerMot(String phrase, String motCible) {
        String etoiles = "*".repeat(motCible.length());
        return phrase.replaceAll("(?i)" + motCible, etoiles);
    }

    public static void main(String[] args) {
        System.out.println(capitaliser("bonjour tout le monde"));
        System.out.println(inverserCasse("Java Est Super"));
        System.out.println(censurerMot("Java est super, j'aime Java !", "Java"));
    }
}