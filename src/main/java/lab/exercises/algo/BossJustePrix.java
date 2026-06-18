import java.util.Random;
import java.util.Scanner;

public class BossJustePrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Génère un nombre aléatoire entre 1 et 100
        int nombreMystere = random.nextInt(100) + 1; 
        int maxEssais = 5;
        boolean aGagne = false;

        System.out.println("--- BIENVENUE AU JUSTE PRIX ---");
        System.out.println("J'ai choisi un nombre entre 1 et 100. Tu as 5 essais !");

        // À TOI DE JOUER :
        // 1. Crée une boucle qui tourne au maximum 5 fois.
        // 2. Demande un nombre au joueur à chaque tour.
        // 3. Si le nombre est trop petit -> affiche "C'est PLUS GRAND !"
        // 4. Si le nombre est trop grand -> affiche "C'est PLUS PETIT !"
        // 5. Si le joueur trouve -> affiche "Bravo ! Tu as trouvé !" et passe aGagne à true, puis stoppe la boucle.
        


        // Fin de partie
        if (!aGagne) {
            System.out.println("Dommage, tu as perdu... Le nombre était : " + nombreMystere);
        }
    }
}