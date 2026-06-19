import java.util.Scanner;
import java.util.Random;



public class BossJustePrixFonctions {
    // 1. À TOI DE JOUER : Crée la méthode genererNombreAleatoire
    // Elle ne prend rien en paramètre, et renvoie un int entre 1 et 100.
    


    // 2. À TOI DE JOUER : Crée la méthode verifierProposition
    // Elle prend deux paramètres : (int tentative, int cible)
    // - Si tentative < cible -> affiche "C'est PLUS GRAND !" et renvoie false
    // - Si tentative > cible -> affiche "C'est PLUS PETIT !" et renvoie false
    // - Si tentative == cible -> affiche "Bravo !" et renvoie true
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxEssais = 5;
        boolean aGagne = false;

        // On appelle notre fonction pour récupérer le nombre mystère
        int nombreMystere = genererNombreAleatoire(); 

        System.out.println("--- LE JUSTE PRIX (VERSION FONCTIONS) ---");

        for (int i = 1; i <= maxEssais; i++) {
            System.out.print("Essai " + i + " - Entrez un nombre : ");
            int choix = scanner.nextInt();

            // On utilise notre fonction de vérification ici !
            aGagne = verifierProposition(choix, nombreMystere);

            if (aGagne) {
                break; // On stoppe la boucle si c'est gagné
            }
        }

        if (!aGagne) {
            System.out.println("Perdu ! Le nombre était : " + nombreMystere);
        }
    }
}
