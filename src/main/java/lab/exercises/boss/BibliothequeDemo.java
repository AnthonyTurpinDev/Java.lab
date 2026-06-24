package lab.exercises.boss;

public class BibliothequeDemo {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque(5);

        bibliotheque.ajouterLivre(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        bibliotheque.ajouterLivre(new Livre("1984", "George Orwell", 1949));
        bibliotheque.ajouterLivre(new Livre("Dune", "Frank Herbert", 1965));
        bibliotheque.ajouterLivre(new Livre("Le Seigneur des Anneaux", "J. R. R. Tolkien", 1954));
        bibliotheque.ajouterLivre(new Livre("1984", "George Orwell", 1949));

        bibliotheque.afficherTous();

        System.out.println("Recherche par auteur :");
        Livre[] resultats = bibliotheque.rechercherParAuteur("George Orwell");
        for (Livre livre : resultats) {
            System.out.println(livre.getTitre() + " - " + livre.getAuteur() + " - " + livre.getAnnee());
        }
    }
}
