// S1_Exo6_InverserNombre.java
// Énoncé : Lis un entier et affiche-le à l'envers.
//          Ex : 1234 → 4321
//          Même technique que l'exo précédent mais tu reconstruis.

import java.util.Scanner;

public class S1_Exo6_InverserNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un entier : ");
        int n = sc.nextInt();
        int inverse = 0;
        int copie = Math.abs(n);

        while (copie > 0) {
            inverse = inverse * 10 + copie % 10;
            copie /= 10;
        }

        System.out.println("Inverse de " + n + " = " + (n < 0 ? "-" : "") + inverse);
    }
}