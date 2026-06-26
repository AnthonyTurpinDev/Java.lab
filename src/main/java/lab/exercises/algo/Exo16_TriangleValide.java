// Exo1_TriangleValide.java
// Énoncé : Lis 3 entiers représentant les côtés d'un triangle.
//          Un triangle est valide si la somme de 2 côtés
//          est TOUJOURS supérieure au 3e côté.
//          Affiche "Triangle valide" ou "Triangle invalide".

import java.util.Scanner;

public class Exo16_TriangleValide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Côté a : "); int a = sc.nextInt();
        System.out.print("Côté b : "); int b = sc.nextInt();
        System.out.print("Côté c : "); int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Les côtés doivent être positifs.");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle valide");
        } else {
            System.out.println("Triangle invalide");
        }
    }
}