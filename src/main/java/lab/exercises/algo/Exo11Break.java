public class Exo11Break {
    public static void main(String[] args) {
        int compteur = 1;

        while (true) { // Boucle théoriquement infinie ! 
            // À TOI DE JOUER :
            // Affiche le compteur.
            // Si le compteur atteint 5, utilise le mot-clé 'break;' pour stopper net la boucle.
            System.out.println(compteur);
            if (compteur == 5) {
                break;
            }
            compteur++;
        }
    }
    
}
