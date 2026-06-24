package lab.exercises.oop;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Retrait impossible");
        }
    }

    public double getSolde() {
        return solde;
    }
}
