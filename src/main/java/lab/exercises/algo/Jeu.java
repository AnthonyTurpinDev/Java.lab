package lab.exercises.algo;

import java.util.Objects;

public class Jeu {

    private String titre;
    private GenreJeu genre;

    public Jeu(String titre, GenreJeu genre) {
        this.titre = titre;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public GenreJeu getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return titre + " - " + genre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jeu)) {
            return false;
        }
        Jeu autre = (Jeu) obj;
        return Objects.equals(titre, autre.titre)
                && genre == autre.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, genre);
    }
}
