// S2_Exo8_FibonacciRecursif.java
// Énoncé : Crée fibRec(int n) → long en récursion.
//          fib(0)=0, fib(1)=1, fib(n)=fib(n-1)+fib(n-2)
//          PIÈGE : la version récursive est très lente pour n>40
//          car elle recalcule tout. Observe la différence avec la version
//          itérative fibIter(int n).

public class S2_Exo8_FibonacciRecursif {

    static long fibRec(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static long fibIter(int n) {
        if (n <= 0) return 0;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b; a = b; b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("=== Fibonacci récursif vs itératif ===");
        for (int i = 0; i <= 15; i++) {
            System.out.println("fib(" + i + ") rec=" + fibRec(i) + " iter=" + fibIter(i));
        }
    }
}