package lab.exercises.oop;

public class CompteurDemo {
    public static void main(String[] args) {
        new Compteur();
        new Compteur();
        new Compteur();
        System.out.println("Nombre d'objets créés : " + Compteur.getNbInstances());
    }
}
