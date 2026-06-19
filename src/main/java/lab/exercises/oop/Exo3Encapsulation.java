package lab.exercises.oop;

class CompteBancaire {
    // On met en private pour cacher l'argent (Encapsulation)
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    // À TOI DE JOUER :
    // 1. Crée un Getter pour récupérer le solde : public double getSolde()
    
    // 2. Crée un Setter pour modifier le solde : public void setSolde(double nouveauSolde)
    // BONUS SÉCURITÉ : Dans le setter, vérifie que le nouveauSolde n'est pas négatif avant de modifier !
    
}

public class Exo3Encapsulation {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000);
        // À TOI DE JOUER : tente de modifier le solde via le setter et affiche-le via le getter.
        
    }
}

