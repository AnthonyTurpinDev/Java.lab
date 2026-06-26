// Exo6_TicketCinema.java
// Énoncé : Calcule le prix d'un ticket.
//          Moins de 12 ans → 5€, plus de 60 ans → 6€,
//          séance avant 14h → -1€ sur n'importe quel tarif,
//          sinon tarif normal → 9€.

import java.util.Scanner;

public class Exo6_TicketCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ton âge : ");
        int age = sc.nextInt();
        System.out.print("Heure de la séance (ex: 10 ou 15) : ");
        int heure = sc.nextInt();

        double prix;

        if (age < 12) {
            prix = 5.0;
        } else if (age > 60) {
            prix = 6.0;
        } else {
            prix = 9.0;
        }

        if (heure < 14) {
            prix -= 1.0;
        }

        System.out.println("Prix de ton ticket : " + prix + "€");
    }
}