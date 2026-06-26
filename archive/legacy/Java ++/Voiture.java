package JavaPP;

public class Voiture extends Vehicule {
    public Voiture(String marque) {
        super(marque);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture " + marque + " démarre");
    }
}
