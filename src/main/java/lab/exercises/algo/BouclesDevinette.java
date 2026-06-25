public class BouclesDevinette {
    public static void main(String[] args) {
        // Consigne : l'utilisateur devine un nombre aléatoire avec do-while.
        do {
            int nombreAleatoire = (int) (Math.random() * 100) + 1; // Génère un nombre aléatoire entre 1 et 100
            int tentative;
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Devinez le nombre entre 1 et 100 : ");
            tentative = scanner.nextInt();

            if (tentative < nombreAleatoire) {
                System.out.println("Trop bas ! Essayez encore.");
            } else if (tentative > nombreAleatoire) {
                System.out.println("Trop haut ! Essayez encore.");
            } else {
                System.out.println("Félicitations ! Vous avez deviné le nombre " + nombreAleatoire + " !");
                break; // Sort de la boucle si le nombre est deviné
            }
        } while (true); // Continue jusqu'à ce que l'utilisateur devine correctement
    }
}