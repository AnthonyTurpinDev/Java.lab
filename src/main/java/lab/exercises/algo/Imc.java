package lab.exercises.algo;

public class Imc {
    public static void main(String[] args) {
        double poids = 70.0;
        double taille = 1.75;
        double imc = poids / (taille * taille);

        System.out.printf("IMC : %.2f%n", imc);
    }
}
