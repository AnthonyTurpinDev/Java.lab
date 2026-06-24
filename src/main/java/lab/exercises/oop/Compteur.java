package lab.exercises.oop;

public class Compteur {
    private static int nbInstances = 0;

    public Compteur() {
        nbInstances++;
    }

    public static int getNbInstances() {
        return nbInstances;
    }
}
