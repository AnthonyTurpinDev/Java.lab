// Exo7_VoyelleConsonne.java
// Énoncé : Lis un seul caractère.
//          Affiche s'il s'agit d'une voyelle, d'une consonne,
//          d'un chiffre, ou d'un caractère spécial.
// PIÈGE : utilise switch sur un char avec des cases groupés.

import java.util.Scanner;

public class Exo7_VoyelleConsonne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre un caractère : ");
        char c = sc.next().toLowerCase().charAt(0);

        switch (c) {
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                System.out.println("Voyelle"); break;
            case '0': case '1': case '2': case '3': case '4':
            case '5': case '6': case '7': case '8': case '9':
                System.out.println("Chiffre"); break;
            default:
                if (c >= 'a' && c <= 'z') {
                    System.out.println("Consonne");
                } else {
                    System.out.println("Caractère spécial");
                }
        }
    }
}