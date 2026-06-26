// S1_Exo4_DevinerNombre.java
// Énoncé : Le programme choisit 42 (fixe pour l'instant).
//          L'utilisateur saisit des nombres jusqu'à trouver.
//          Affiche "Trop grand", "Trop petit" ou "Trouvé !".
//          Utilise un while — tu ne sais pas combien de tours il faudra.

import java.util.Scanner;

public class S1_Exo4_DevinerNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 42;
        int guess = -1;

        while (guess != secret) {
            System.out.print("Devine : ");
            guess = sc.nextInt();

            if (guess < secret)       System.out.println("Trop petit !");
            else if (guess > secret)  System.out.println("Trop grand !");
            else                      System.out.println("Trouvé !");
        }
    }
}