// Exo4_Mention.java
// Énoncé : Lis une note entre 0 et 20 et affiche la mention :
//          >= 16 = Très bien, >= 14 = Bien, >= 12 = Assez bien,
//          >= 10 = Passable, < 10 = Insuffisant.

import java.util.Scanner;

public class Exo4_Mention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre ta note (0-20) : ");
        double note = sc.nextDouble();

        if (note >= 16) {
            System.out.println("Très bien");
        } else if (note >= 14) {
            System.out.println("Bien");
        } else if (note >= 12) {
            System.out.println("Assez bien");
        } else if (note >= 10) {
            System.out.println("Passable");
        } else {
            System.out.println("Insuffisant");
        }
    }
}