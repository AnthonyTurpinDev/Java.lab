// S2_Exo14_DecimalBinaire.java
// Énoncé : Convertis un entier positif en binaire SANS utiliser
//          Integer.toBinaryString().
//          Méthode : divisions successives par 2, on récupère les restes.
//          Ex : 13 → 1101

import java.util.Scanner;

public class S2_Exo14_DecimalBinaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entier positif : ");
        int n = sc.nextInt();

        if (n == 0) { System.out.println("0 en binaire = 0"); return; }

        String binaire = "";
        int copie = n;

        while (copie > 0) {
            binaire = (copie % 2) + binaire;
            copie /= 2;
        }

        System.out.println(n + " en binaire = " + binaire);
    }
}