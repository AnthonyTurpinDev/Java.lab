package JavaPP;

public abstract class Vehicule {
    protected String marque;

    protected Vehicule(String marque) {
        this.marque = marque;
    }

    public abstract void demarrer();
}
