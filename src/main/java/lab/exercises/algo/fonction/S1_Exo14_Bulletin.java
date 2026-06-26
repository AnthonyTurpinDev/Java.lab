// S1_Exo14_Bulletin.java
// Énoncé : Crée estMajeur(int age) → boolean
//          Crée getMention(double note) → String
//          Crée estAdmis(double note) → boolean (note >= 10)
//          Crée afficherBulletin(String nom, int age, double note)
//          qui appelle toutes les autres et affiche un bulletin complet.

public class S1_Exo14_Bulletin {

    static boolean estMajeur(int age)      { return age >= 18; }
    static boolean estAdmis(double note)   { return note >= 10; }

    static String getMention(double note) {
        if (note >= 16) return "Très bien";
        if (note >= 14) return "Bien";
        if (note >= 12) return "Assez bien";
        if (note >= 10) return "Passable";
        return "Insuffisant";
    }

    static void afficherBulletin(String nom, int age, double note) {
        System.out.println("╔══════════════════════════╗");
        System.out.printf( "║ Élève  : %-16s║%n", nom);
        System.out.printf( "║ Age    : %-16s║%n", age + " ans " + (estMajeur(age) ? "(majeur)" : "(mineur)"));
        System.out.printf( "║ Note   : %-16s║%n", note + "/20");
        System.out.printf( "║ Mention: %-16s║%n", getMention(note));
        System.out.printf( "║ Statut : %-16s║%n", estAdmis(note) ? "ADMIS" : "RECALE");
        System.out.println("╚══════════════════════════╝");
    }

    public static void main(String[] args) {
        afficherBulletin("Alice Dupont", 17, 15.5);
        System.out.println();
        afficherBulletin("Bob Martin", 19, 8.0);
    }
}