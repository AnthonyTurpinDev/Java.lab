// S1_Exo2_CompteARebours.java
// Énoncé : Lis N et affiche le compte à rebours de N jusqu'à 0.
//          Puis affiche "Décollage !".
//          PIÈGE : le for décrémente — i-- et la condition est i >= 0.

import java.util.Scanner;

public class S1_Exo2_CompteARebours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Départ depuis : ");
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Décollage !");
    }
}