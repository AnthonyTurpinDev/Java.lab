package lab.exercises.oop;

public class ChienDemo {
    public static void main(String[] args) {
        Chien chien1 = new Chien("Rex", "Labrador", 3);
        Chien chien2 = new Chien();
        Chien chien3 = new Chien("Milo", "Berger", 5);

        chien1.afficher();
        chien2.afficher();
        chien3.afficher();
    }
}
