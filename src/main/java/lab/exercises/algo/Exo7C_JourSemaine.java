// Exo7_JourSemaine.java
// Énoncé : Entre un chiffre de 1 à 7 et affiche le nom du jour.
//          Utilise un switch. Gère le cas invalide.

import java.util.Scanner;

public class Exo7C_JourSemaine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numéro du jour (1=Lundi ... 7=Dimanche) : ");
        int jour = sc.nextInt();

        switch (jour) {
            case 1: System.out.println("Lundi"); break;
            case 2: System.out.println("Mardi"); break;
            case 3: System.out.println("Mercredi"); break;
            case 4: System.out.println("Jeudi"); break;
            case 5: System.out.println("Vendredi"); break;
            case 6: System.out.println("Samedi"); break;
            case 7: System.out.println("Dimanche"); break;
            default: System.out.println("Jour invalide");
        }
    }
}