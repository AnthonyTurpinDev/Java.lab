// Exo10_FizzBuzz.java
// Énoncé : Affiche les nombres de 1 à 100.
//          Multiple de 3 → "Fizz"
//          Multiple de 5 → "Buzz"
//          Multiple des deux → "FizzBuzz"
//          Sinon → le nombre.

public class Exo10C_FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}