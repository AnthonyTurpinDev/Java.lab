public class Exo2Parametres {

    // À TOI DE JOUER : Crée une méthode 'saluerUtilisateur'
    // Elle prend un paramètre (String prenom) et affiche "Salut [prenom] !"
    public static void saluerUtilisateur(String prenom) {
        System.out.println("Salut " + prenom + " !");
    }


    public static void main(String[] args) {
        // Appelle la méthode deux fois avec des prénoms différents
        // Ex: saluerUtilisateur("Marc");
        saluerUtilisateur("Marc");
        saluerUtilisateur("Alice");
    }
}

