package lab.exercises.structures;

public class Palindrome {
    public static void main(String[] args) {
        String mot = "radar";
        String inverse = "";

        for (int i = mot.length() - 1; i >= 0; i--) {
            inverse += mot.charAt(i);
        }

        if (mot.equals(inverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Pas un palindrome");
        }
    }
}
