public class BouclesSommeEntiers {
    public static void main(String[] args) {
        // Consigne : calcule la somme des N premiers entiers.
        int N = 10;
        int somme = 0;

        for ( int i = 1; i <= N; i++) {
            somme += i;
        }

        System.out.println("La somme des " + N + " premiers entiers est : " + somme);
    }
}