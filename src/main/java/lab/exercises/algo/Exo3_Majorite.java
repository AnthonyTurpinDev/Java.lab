// Exo3_Majorite.java
// Énoncé : Lis un âge. Affiche "majeur" si >= 18, sinon "mineur".
//          Bonus : affiche combien d'années avant la majorité.

import java.util.Scanner;

public class Exo3_Majorite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quel est ton âge ? ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Tu es majeur.");
        } else {
            System.out.println("Tu es mineur. Encore " + (18 - age) + " an(s) avant la majorité.");
        }
    }
}