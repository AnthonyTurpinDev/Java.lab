package lab.exercises.oop;

public class Bloc {
    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected boolean porteur;

    public Bloc(final int longueur, final int largeur, final int hauteur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Bloc(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
        this(longueur, largeur, hauteur);
        this.porteur = porteur;
    }

    public void afficheUneDescription() {
        System.out.println("Je suis un bloc !");
    }

    public void afficherBloc() {
        afficheUneDescription();
    }
}
