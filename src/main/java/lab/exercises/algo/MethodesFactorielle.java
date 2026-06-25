public class MethodesFactorielle {
    public static long factorielle(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Consigne : crée une méthode factorielle(n) de façon itérative.
        int n = 5;
        System.out.println("La factorielle de " + n + " est : " + factorielle(n));
    }
}