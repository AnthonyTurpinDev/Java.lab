import java.util.Random;
import java.util.Scanner;

public class BossJustePrixFonctions {
    public static int genererNombreAleatoire() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static boolean verifierProposition(int tentative, int cible) {
        if (tentative < cible) {
            System.out.println("C'est PLUS GRAND !");
            return false;
        } else if (tentative > cible) {
            System.out.println("C'est PLUS PETIT !");
            return false;
        } else {
            System.out.println("Bravo !");
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxEssais = 5;
        boolean aGagne = false;

        int nombreMystere = genererNombreAleatoire();

        System.out.println("--- LE JUSTE PRIX (VERSION FONCTIONS) ---");

        for (int i = 1; i <= maxEssais; i++) {
            System.out.print("Essai " + i + " - Entrez un nombre : ");
            int choix = scanner.nextInt();

            aGagne = verifierProposition(choix, nombreMystere);

            if (aGagne) {
                break;
            }
        }

        if (!aGagne) {
            System.out.println("Perdu ! Le nombre était : " + nombreMystere);
        }

        scanner.close();
    }
}
