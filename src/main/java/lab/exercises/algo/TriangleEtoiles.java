package lab.exercises.algo;

public class TriangleEtoiles {
    public static void main(String[] args) {
        int lignes = 5;

        for (int i = 1; i <= lignes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
