package JavaPP;

public class Moto extends Vehicule {
    public Moto(String marque) {
        super(marque);
    }

    @Override
    public void demarrer() {
        System.out.println("La moto " + marque + " démarre");
    }
}
