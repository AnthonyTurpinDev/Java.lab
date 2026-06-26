// S3_Exo7_ValidateurMDP.java
// Énoncé : Découpe chaque règle en sa propre fonction.
//          aAssezDeCaracteres(String s) → boolean (>= 8)
//          aUnChiffre(String s) → boolean
//          aUneMajuscule(String s) → boolean
//          aUnCaractereSpecial(String s) → boolean
//          estMotDePasseValide(String s) → boolean (appelle les 4)
//          afficherDiagnostic(String s) qui détaille chaque règle.
//          C'EST exactement le style Epitech : 1 fonction = 1 responsabilité.

public class S3_Exo7_ValidateurMDP {

    static boolean aAssezDeCaracteres(String s) { return s.length() >= 8; }
    static boolean aUnChiffre(String s)         { return s.matches(".*[0-9].*"); }
    static boolean aUneMajuscule(String s)      { return s.matches(".*[A-Z].*"); }
    static boolean aUneMinuscule(String s)      { return s.matches(".*[a-z].*"); }
    static boolean aUnCaractereSpecial(String s){ return s.matches(".*[!@#$%^&*()_+\\-=].*"); }

    static boolean estValide(String s) {
        return aAssezDeCaracteres(s) && aUnChiffre(s)
            && aUneMajuscule(s) && aUneMinuscule(s) && aUnCaractereSpecial(s);
    }

    static void afficherDiagnostic(String mdp) {
        System.out.println("Mot de passe : \"" + mdp + "\"");
        System.out.println("  >= 8 chars    : " + (aAssezDeCaracteres(mdp) ? "✓" : "✗"));
        System.out.println("  Un chiffre    : " + (aUnChiffre(mdp)         ? "✓" : "✗"));
        System.out.println("  Une majuscule : " + (aUneMajuscule(mdp)      ? "✓" : "✗"));
        System.out.println("  Une minuscule : " + (aUneMinuscule(mdp)      ? "✓" : "✗"));
        System.out.println("  Char spécial  : " + (aUnCaractereSpecial(mdp)? "✓" : "✗"));
        System.out.println("  Résultat      : " + (estValide(mdp) ? "VALIDE" : "INVALIDE"));
        System.out.println();
    }

    public static void main(String[] args) {
        afficherDiagnostic("abc");
        afficherDiagnostic("password");
        afficherDiagnostic("Password1!");
        afficherDiagnostic("Ep1tech@2025");
    }
}