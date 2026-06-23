public class Exo3OperateursLogiques  {
    public static void main(String[] args) {
        int age = 20;
        boolean aLePermis = false;

        // À TOI DE JOUER :
        // Le joueur peut louer une voiture SI il a au moins 21 ans ET s'il a le permis.
        // Affiche "Location autorisée" ou "Location refusée".
        if (age >= 21 && aLePermis == true) {
            System.out.println("Location autorisée");
        } else {
            System.out.println("Location refusée");
        }
    }
}
