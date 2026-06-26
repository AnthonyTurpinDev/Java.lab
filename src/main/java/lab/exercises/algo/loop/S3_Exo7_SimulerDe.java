// S3_Exo7_SimulerDe.java
// Énoncé : Lance un dé (1-6) 1000 fois.
//          Compte combien de fois chaque face est sortie.
//          Affiche les statistiques et la face la plus fréquente.

import java.util.Random;

public class S3_Exo7_SimulerDe {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] freq = new int[7];

        for (int i = 0; i < 1000; i++) {
            freq[rng.nextInt(6) + 1]++;
        }

        int max = 0, facePlusFreq = 0;
        for (int face = 1; face <= 6; face++) {
            System.out.printf("Face %d : %d fois (%.1f%%)%n",
                face, freq[face], freq[face] / 10.0);
            if (freq[face] > max) { max = freq[face]; facePlusFreq = face; }
        }
        System.out.println("Face la plus fréquente : " + facePlusFreq);
    }
}