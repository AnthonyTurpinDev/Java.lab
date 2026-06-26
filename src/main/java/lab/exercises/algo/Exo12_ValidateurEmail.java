// Exo12_ValidateurEmail.java
// Énoncé : Un email est valide (de manière simplifiée) si :
//   1. Il contient exactement un @
//   2. Il contient un . après le @
//   3. Il ne commence pas par @ et ne finit pas par .
// PIÈGE : utilise indexOf, lastIndexOf et les conditions sur les index.

import java.util.Scanner;

public class Exo12_ValidateurEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Email : ");
        String email = sc.next();

        int indexAt  = email.indexOf('@');
        int indexDot = email.lastIndexOf('.');

        boolean aUnAt         = indexAt != -1 && email.indexOf('@', indexAt + 1) == -1;
        boolean dotApresAt    = indexAt != -1 && indexDot > indexAt + 1;
        boolean pasBordures   = !email.startsWith("@") && !email.endsWith(".");

        if (aUnAt && dotApresAt && pasBordures) {
            System.out.println("Email valide ✓");
        } else {
            System.out.println("Email invalide ✗");
            if (!aUnAt)       System.out.println("  - Doit contenir exactement un @");
            if (!dotApresAt)  System.out.println("  - Doit contenir un . après le @");
            if (!pasBordures) System.out.println("  - Ne doit pas commencer par @ ni finir par .");
        }
    }
}
