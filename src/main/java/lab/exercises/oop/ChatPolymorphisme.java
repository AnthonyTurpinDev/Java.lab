package lab.exercises.oop;

public class ChatPolymorphisme extends Animal {
    public ChatPolymorphisme(String nom) {
        super(nom);
    }

    @Override
    public void parler() {
        System.out.println("Le chat miaule");
    }
}
