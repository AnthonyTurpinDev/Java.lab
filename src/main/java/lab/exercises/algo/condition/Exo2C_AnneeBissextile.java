package condition;
// Exo2_AnneeBissextile.java
// Énoncé : Une année est bissextile si :
//   - divisible par 4 ET (pas divisible par 100 OU divisible par 400)
// Affiche "Bissextile" ou "Pas bissextile".
// PIÈGE : il faut combiner && et || avec les bonnes parenthèses !

import java.util.Scanner;

public class Exo2C_AnneeBissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Année : ");
        int annee = sc.nextInt();

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println(annee + " est bissextile");
        } else {
            System.out.println(annee + " n'est pas bissextile");
        }
    }
}