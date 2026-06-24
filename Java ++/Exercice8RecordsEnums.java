package JavaPP;

public class Exercice8RecordsEnums {
    enum Statut { ACTIF, INACTIF, SUSPENDU }

    record Utilisateur(String nom, int age, Statut statut) {}

    public static void main(String[] args) {
        // Consigne :
        // - Crée plusieurs utilisateurs.
        // - Affiche leurs informations.
        // - Filtre et affiche uniquement les utilisateurs ACTIF avec une boucle for.
    }
}
