package lab.exercises.algo;

public class CalculatriceSwitch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        char operateur = '/';

        switch (operateur) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division par zéro impossible");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Opérateur invalide");
        }
    }
}
