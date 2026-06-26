// S2_Exo7_MoyenneSerie.java
// Énoncé : L'utilisateur entre N notes (entre 0 et 20).
//          Affiche la moyenne, la meilleure et la moins bonne note.

import java.util.Scanner;

public class S2_Exo7_MoyenneSerie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Combien de notes ? ");
        int n = sc.nextInt();

        double somme = 0;
        double min = 20, max = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Note " + i + " : ");
            double note = sc.nextDouble();
            somme += note;
            if (note < min) min = note;
            if (note > max) max = note;
        }

        System.out.printf("Moyenne : %.2f%n", somme / n);
        System.out.println("Meilleure : " + max + " | Moins bonne : " + min);
    }
}