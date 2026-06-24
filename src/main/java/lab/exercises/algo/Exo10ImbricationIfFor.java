
public class Exo10ImbricationIfFor {
    public static void main(String[] args) {
        // À TOI DE JOUER :
        // Fais une boucle de 1 à 20.
        // À chaque tour, affiche le nombre UNIQUEMENT s'il est pair (indice : nombre % 2 == 0).
        for (int i = 1; i <= 20; i++) {
            if ( i % 2 == 0) {
                System.out.println("pair");
            } else {
                System.out.println("impair");
            }
        }
        
    }
}
