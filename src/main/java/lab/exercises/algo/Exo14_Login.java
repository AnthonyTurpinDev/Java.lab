// Exo14_Login.java
// Énoncé : Simule un système de login.
//          L'user a 3 tentatives. Login correct = "admin" / "1234".
//          Affiche "Connecté !" ou "Compte bloqué" après 3 échecs.

import java.util.Scanner;

public class Exo14_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String USER = "admin";
        final String PASS = "1234";
        int tentatives = 0;
        boolean connecte = false;

        while (tentatives < 3 && !connecte) {
            System.out.print("Login : ");
            String user = sc.next();
            System.out.print("Mot de passe : ");
            String pass = sc.next();

            if (user.equals(USER) && pass.equals(PASS)) {
                connecte = true;
                System.out.println("Connecté !");
            } else {
                tentatives++;
                System.out.println("Identifiants incorrects. Tentative " + tentatives + "/3");
            }
        }

        if (!connecte) {
            System.out.println("Compte bloqué après 3 tentatives.");
        }
    }
}