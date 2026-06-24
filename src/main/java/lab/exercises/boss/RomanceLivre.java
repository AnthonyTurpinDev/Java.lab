package lab.exercises.boss;

public class RomanceLivre extends Livre {
    private String sousGenre;

    public RomanceLivre(String titre, String auteur, int annee, String sousGenre) {
        super(titre, auteur, annee);
        this.sousGenre = sousGenre;
    }

    public String getSousGenre() {
        return sousGenre;
    }

    public void setSousGenre(String sousGenre) {
        this.sousGenre = sousGenre;
    }
}
