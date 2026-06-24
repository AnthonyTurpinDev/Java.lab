public class Exo8WhileSimple {
    public static void main(String[] args) {
        int energie = 10;

        // À TOI DE JOUER :
        // Tant que l'énergie est supérieure à 0, affiche "Le robot marche... Énergie restante : X".
        // À chaque tour, l'énergie baisse de 2.
        // Quand la boucle s'arrête, affiche "Robot déchargé".
        while (energie > 0) {
            System.out.println("Le robot marche... Énergie restante : " + energie);
            energie -= 2;
        }
        System.out.println("Robot déchargé");
    }
}
