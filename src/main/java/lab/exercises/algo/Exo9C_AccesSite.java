// Exo9_AccesSite.java
// Énoncé : Un site nécessite d'avoir >= 13 ans ET d'être connecté.
//          Lis l'âge et si l'utilisateur est connecté (true/false).
//          Affiche "Accès autorisé" ou le motif de refus.

import java.util.Scanner;

public class Exo9C_AccesSite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ton âge : ");
        int age = sc.nextInt();
        System.out.print("Es-tu connecté ? (true/false) : ");
        boolean connecte = sc.nextBoolean();

        if (age >= 13 && connecte) {
            System.out.println("Accès autorisé");
        } else if (age < 13) {
            System.out.println("Accès refusé : tu dois avoir au moins 13 ans.");
        } else {
            System.out.println("Accès refusé : tu dois être connecté.");
        }
    }
}