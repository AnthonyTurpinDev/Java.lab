package lab.exercises.oop;

public class ChienPolymorphisme extends Animal {
    public ChienPolymorphisme(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("Le chien aboie");
    }
}
