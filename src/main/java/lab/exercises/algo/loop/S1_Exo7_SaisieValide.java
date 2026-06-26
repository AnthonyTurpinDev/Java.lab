// S1_Exo7_SaisieValide.java
// Énoncé : Demande un nombre entre 1 et 10.
//          Tant que l'utilisateur entre une valeur hors de cette plage,
//          redemande. Affiche "OK !" quand c'est bon.
//          POURQUOI do-while : on veut TOUJOURS afficher le prompt au moins 1 fois.

import java.util.Scanner;

public class S1_Exo7_SaisieValide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entre un nombre entre 1 et 10 : ");
            n = sc.nextInt();
            if (n < 1 || n > 10) {
                System.out.println("Invalide, réessaie.");
            }
        } while (n < 1 || n > 10);

        System.out.println("OK ! Tu as entré : " + n);
    }
}