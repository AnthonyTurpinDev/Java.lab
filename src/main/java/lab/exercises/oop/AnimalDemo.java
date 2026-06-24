package lab.exercises.oop;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animaux = {new ChienPolymorphisme("Rex"), new ChatPolymorphisme("Minou")};

        for (Animal animal : animaux) {
            animal.parler();
        }
    }
}
