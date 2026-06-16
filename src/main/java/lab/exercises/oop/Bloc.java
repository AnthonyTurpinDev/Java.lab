package lab.exercises.oop;

public class Bloc {
     String description;

    Bloc() {
        this.description = "Ceci est un bloc du jeu Epicraft's Journey";
    }

    void afficherDescription() {
        System.out.println(this.description);
    }
}
