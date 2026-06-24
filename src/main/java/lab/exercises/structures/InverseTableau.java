package lab.exercises.structures;

public class InverseTableau {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};

        for (int i = 0; i < tableau.length / 2; i++) {
            int temp = tableau[i];
            tableau[i] = tableau[tableau.length - 1 - i];
            tableau[tableau.length - 1 - i] = temp;
        }

        for (int value : tableau) {
            System.out.print(value + " ");
        }
    }
}
