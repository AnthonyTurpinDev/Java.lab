package lab.exercises.boss;

import java.util.Arrays;

public class Bibliotheque {
    private Livre[] livres;
    private int taille;

    public Bibliotheque(int capacite) {
        livres = new Livre[capacite];
        taille = 0;
    }

    public void ajouterLivre(Livre livre) {
        if (taille < livres.length) {
            livres[taille++] = livre;
        }
    }

    public void afficherTous() {
        for (int i = 0; i < taille; i++) {
            System.out.println(livres[i].getTitre() + " - " + livres[i].getAuteur() + " - " + livres[i].getAnnee());
        }
    }

    public Livre[] rechercherParAuteur(String auteur) {
        Livre[] resultats = new Livre[taille];
        int count = 0;

        for (int i = 0; i < taille; i++) {
            if (livres[i].getAuteur().equalsIgnoreCase(auteur)) {
                resultats[count++] = livres[i];
            }
        }

        return Arrays.copyOf(resultats, count);
    }
}
