package lab.exercises.algo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Inventaire {

    private Set<Jeu> jeux;

    public Inventaire() {
        jeux = new LinkedHashSet<>();
    }

    public void ajouterJeu(Jeu jeu) throws JeuInvalideException {
        if (jeu == null || jeu.getTitre() == null || jeu.getTitre().trim().isEmpty()) {
            throw new JeuInvalideException("Le titre du jeu est invalide.");
        }
        jeux.add(jeu);
    }

    public void afficherJeux() {
        if (jeux.isEmpty()) {
            System.out.println("L'inventaire est vide.");
            return;
        }
        for (Jeu jeu : jeux) {
            System.out.println(jeu);
        }
    }

    public Jeu trouverJeuParTitre(String titre) {
        if (titre == null) {
            return null;
        }
        for (Jeu jeu : jeux) {
            if (titre.equals(jeu.getTitre())) {
                return jeu;
            }
        }
        return null;
    }
}
