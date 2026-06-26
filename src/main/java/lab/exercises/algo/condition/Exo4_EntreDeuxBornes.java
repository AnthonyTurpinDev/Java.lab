package condition;
// Exo4_EntreDeuxBornes.java
// Énoncé : Lis un nombre N et deux bornes min/max.
//          Affiche si N est :
//          - strictement entre les bornes (exclusif)
//          - entre les bornes incluses
//          - en dehors des bornes

import java.util.Scanner;

public class Exo4_EntreDeuxBornes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Borne min : "); int min = sc.nextInt();
        System.out.print("Borne max : "); int max = sc.nextInt();
        System.out.print("Nombre N  : "); int n   = sc.nextInt();

        if (n > min && n < max) {
            System.out.println(n + " est strictement entre " + min + " et " + max);
        } else if (n >= min && n <= max) {
            System.out.println(n + " est entre " + min + " et " + max + " (bornes incluses)");
        } else {
            System.out.println(n + " est en dehors des bornes");
        }
    }
}
