package lab.exercises.algo;

public class FibonacciMethod {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int previous = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
