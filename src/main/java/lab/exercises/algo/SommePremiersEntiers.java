package lab.exercises.algo;

public class SommePremiersEntiers {
    public static void main(String[] args) {
        int n = 10;
        int somme = 0;

        for (int i = 1; i <= n; i++) {
            somme += i;
        }

        System.out.println("Somme : " + somme);
    }
}
