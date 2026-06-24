import java.util.Scanner;

public class Exo9DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codeSaisi;
        int codeCorrect = 1234;

        // À TOI DE JOUER :
        // Demande le code secret à l'utilisateur VIA une boucle do-while.
        // Tant que le code saisi n'est pas le bon (1234), on recommence.
        do {
            System.out.print("Entrez le code secret : ");
            codeSaisi = scanner.nextInt();
        } while (codeSaisi != codeCorrect);  // Modifie la condition ici !

        System.out.println("Code correct ! Accès autorisé.");
    }
}
