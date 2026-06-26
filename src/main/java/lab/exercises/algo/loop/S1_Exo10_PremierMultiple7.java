// S1_Exo10_PremierMultiple7.java
// Énoncé : Entre un entier N > 0.
//          Cherche le premier multiple de 7 supérieur ou égal à N.
//          Utilise un while avec break quand tu le trouves.

import java.util.Scanner;

public class S1_Exo10_PremierMultiple7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre N : ");
        int n = sc.nextInt();
        int i = n;

        while (true) {
            if (i % 7 == 0) {
                System.out.println("Premier multiple de 7 >= " + n + " : " + i);
                break;
            }
            i++;
        }
    }
}