package lab.exercises.algo;

import java.util.Random;
import java.util.Scanner;

public class Devinette {
    public static void main(String[] args) {
        Random random = new Random();
        int nombreMystere = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentative;

        do {
            System.out.print("Devinez le nombre (1-100) : ");
            tentative = scanner.nextInt();

            if (tentative < nombreMystere) {
                System.out.println("Trop petit");
            } else if (tentative > nombreMystere) {
                System.out.println("Trop grand");
            }
        } while (tentative != nombreMystere);

        System.out.println("Bravo !");
        scanner.close();
    }
}
