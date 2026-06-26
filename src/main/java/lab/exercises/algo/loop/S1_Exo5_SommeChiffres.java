// S1_Exo5_SommeChiffres.java
// Énoncé : Lis un entier positif N.
//          Calcule et affiche la somme de ses chiffres.
//          Ex : 1234 → 1+2+3+4 = 10
//          ASTUCE : utilise % 10 pour prendre le dernier chiffre,
//          puis / 10 pour l'enlever.

import java.util.Scanner;

public class S1_Exo5_SommeChiffres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un entier positif : ");
        int n = sc.nextInt();
        int somme = 0;
        int copie = n;

        while (copie > 0) {
            somme += copie % 10;
            copie /= 10;
        }

        System.out.println("Somme des chiffres de " + n + " = " + somme);
    }
}