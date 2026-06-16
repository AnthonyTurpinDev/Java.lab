package lab.exercises.oop;

public class Mur extends Bloc {

    public Mur(int x, int y, int z, boolean b) {
        super(x, y, z, b);
    }

    public void afficherBloc() {
        System.out.println("Je suis un mur !");
    }

    public static void main(String[] args) {
        Bloc unBloc = new Mur(10, 10, 5, true); // La variable est typé Bloc mais l’instance est bien Mur.
        unBloc.afficherBloc(); // cette instruction affiche dans la console : Je suis un mur !
    }
}
