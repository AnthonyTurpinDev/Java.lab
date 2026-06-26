// S1_Exo3_TableMultiplication.java
// Énoncé : Lis un entier N et affiche sa table de multiplication de 1 à 10.
//          Format : "N x i = résultat"

import java.util.Scanner;

public class S1_Exo3_TableMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Table de : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}