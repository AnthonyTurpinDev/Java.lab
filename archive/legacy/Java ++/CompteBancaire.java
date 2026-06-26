package JavaPP;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant) {
        // Consigne :
        // Lancer une IllegalArgumentException si montant > solde.
    }

    public void transferer(CompteBancaire destinataire, double montant) throws IllegalArgumentException {
        // Consigne :
        // Utiliser throws pour propager l'exception.
    }
}
