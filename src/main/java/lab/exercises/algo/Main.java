package lab.exercises.algo;

public class Main {

    // exo 1
    public static void main(String[] args) {
        int num = 5;
        num = 10;
        final int immutable = 20;

        System.out.println("Le nombre est : " + num);
        System.out.println("La valeur immuable est : " + immutable);

        // exo 2
        phrase();
    }

    public static void phrase() {
        String language = "Java";
        String phrase = language + " est un langage de programmation.";
        System.out.println(phrase);
    }
}