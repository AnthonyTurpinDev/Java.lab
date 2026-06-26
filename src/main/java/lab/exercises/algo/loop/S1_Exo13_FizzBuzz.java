// S1_Exo13_FizzBuzz.java
// Énoncé : Affiche 1 à 100.
//          Multiple de 3 → Fizz
//          Multiple de 5 → Buzz
//          Multiple de 15 → FizzBuzz
//          Sinon → le nombre
//          PIÈGE : tester 15 AVANT 3 et 5.

public class S1_Exo13_FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if      (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3  == 0) System.out.println("Fizz");
            else if (i % 5  == 0) System.out.println("Buzz");
            else                  System.out.println(i);
        }
    }
}