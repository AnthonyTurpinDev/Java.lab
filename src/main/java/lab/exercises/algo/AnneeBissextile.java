package lab.exercises.algo;

public class AnneeBissextile {
    public static void main(String[] args) {
        int annee = 2024;

        boolean bissextile = (annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0);

        if (bissextile) {
            System.out.println(annee + " est bissextile.");
        } else {
            System.out.println(annee + " n'est pas bissextile.");
        }
    }
}
