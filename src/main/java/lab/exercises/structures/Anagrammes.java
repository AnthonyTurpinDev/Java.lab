package lab.exercises.structures;

import java.util.Arrays;

public class Anagrammes {
    public static void main(String[] args) {
        String mot1 = "listen";
        String mot2 = "silent";

        char[] a = mot1.toCharArray();
        char[] b = mot2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Ce sont des anagrammes");
        } else {
            System.out.println("Ce ne sont pas des anagrammes");
        }
    }
}
