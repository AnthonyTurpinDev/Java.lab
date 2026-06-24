package lab.exercises.oop;

public class Chien {
    private String nom;
    private String race;
    private int age;

    public Chien(String nom, String race, int age) {
        this.nom = nom;
        this.race = race;
        this.age = age;
    }

    public Chien() {
        this("Inconnu", "Inconnue", 0);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficher() {
        System.out.println("Nom : " + nom + ", race : " + race + ", age : " + age);
    }
}
