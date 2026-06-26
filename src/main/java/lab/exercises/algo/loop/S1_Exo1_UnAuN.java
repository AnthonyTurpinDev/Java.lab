// S1_Exo1_UnAuN.java
// Énoncé : Lis un entier N et affiche tous les nombres de 1 à N.
//          C'est ton premier for. Comprends chaque partie :
//          for (init ; condition ; incrément)

import java.util.Scanner;

public class S1_Exo1_UnAuN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}