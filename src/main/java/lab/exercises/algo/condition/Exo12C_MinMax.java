package condition;
// Exo12_MinMax.java
// Énoncé : Lis 3 entiers. Affiche le plus petit et le plus grand
//          SANS utiliser Math.min/Math.max — seulement des if.

import java.util.Scanner;

public class Exo12C_MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre 1 : ");
        int a = sc.nextInt();
        System.out.print("Nombre 2 : ");
        int b = sc.nextInt();
        System.out.print("Nombre 3 : ");
        int c = sc.nextInt();

        int min, max;

        if (a <= b && a <= c) { min = a; }
        else if (b <= a && b <= c) { min = b; }
        else { min = c; }

        if (a >= b && a >= c) { max = a; }
        else if (b >= a && b >= c) { max = b; }
        else { max = c; }

        System.out.println("Min : " + min + " | Max : " + max);
    }
}