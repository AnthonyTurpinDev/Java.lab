package lab.exercises.algo;

public class JeuVideo extends Jeu {

    private int note;

    public JeuVideo(String titre, GenreJeu genre, int note) {
        super(titre, genre);
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return super.toString() + " - Note : " + note;
    }
}
