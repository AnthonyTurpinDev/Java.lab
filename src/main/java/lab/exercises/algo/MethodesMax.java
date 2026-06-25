public class MethodesMax {
    public static void main(String[] args) {
        // Consigne : crée une méthode max(a, b) qui retourne le plus grand.
        int a = 10;
        int b = 20;
        System.out.println(max(a, b));
    }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}