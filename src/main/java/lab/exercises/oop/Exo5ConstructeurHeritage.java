package lab.exercises.oop;
public class Exo5ConstructeurHeritage {
    class Employe {
    String nom;
    
    public Employe(String nom) {
        this.nom = nom;
    }
}

// Classe fille
class Developpeur extends Employe {
    String langagePrefere;

    public Developpeur(String nom, String langagePrefere) {
        // À TOI DE JOUER : Utilise 'super(nom);' pour envoyer le nom au constructeur de Employe
        // Puis initialise langagePrefere.
        
    }
}

public class Exo5ConstructeurHeritage {
    public static void main(String[] args) {
        Developpeur dev = new Developpeur("Alan", "Java");
        System.out.println(dev.nom + " code en " + dev.langagePrefere);
    }
}
}
