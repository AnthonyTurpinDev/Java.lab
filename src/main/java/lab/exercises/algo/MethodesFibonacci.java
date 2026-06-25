public class MethodesFibonacci {
    public static void main(String[] args) {
        // Consigne : crée une méthode qui retourne le Nième nombre de Fibonacci.
        int n = 10; // Exemple : calculer le 10ème nombre de Fibonacci
        System.out.println("Le " + n + "ème nombre de Fibonacci est : " + fibonacci(n));
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fib = 1;
        long prev = 0;
        for (int i = 2; i <= n; i++) {
            long temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
}