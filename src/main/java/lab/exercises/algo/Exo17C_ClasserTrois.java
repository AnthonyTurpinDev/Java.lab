// Exo3_ClasserTrois.java
// Énoncé : Lis 3 entiers et affiche-les du plus petit au plus grand.
//          Utilise uniquement des if/else — pas de tableau, pas de sort.

import java.util.Scanner;

public class Exo17C_ClasserTrois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : "); int a = sc.nextInt();
        System.out.print("b : "); int b = sc.nextInt();
        System.out.print("c : "); int c = sc.nextInt();

        int min, mid, max;

        if (a <= b && a <= c) {
            min = a;
            if (b <= c) { mid = b; max = c; }
            else         { mid = c; max = b; }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) { mid = a; max = c; }
            else         { mid = c; max = a; }
        } else {
            min = c;
            if (a <= b) { mid = a; max = b; }
            else         { mid = b; max = a; }
        }

        System.out.println("Ordre : " + min + " < " + mid + " < " + max);
    }
}
