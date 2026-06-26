// S3_Exo5_SommeChiffresRec.java
// Énoncé : Crée sommeChiffres(int n) → int en récursion.
//          Crée nombreDeChiffres(int n) → int en récursion.
//          Crée estNombreArmstrong(int n) → boolean
//          (un nombre de Armstrong : somme de ses chiffres élevés
//          à la puissance du nombre de chiffres = le nombre lui-même)
//          Ex : 153 = 1³ + 5³ + 3³

public class S3_Exo5_SommeChiffresRec {

    static int sommeChiffres(int n) {
        n = Math.abs(n);
        if (n < 10) return n;
        return n % 10 + sommeChiffres(n / 10);
    }

    static int nombreDeChiffres(int n) {
        n = Math.abs(n);
        if (n < 10) return 1;
        return 1 + nombreDeChiffres(n / 10);
    }

    static boolean estArmstrong(int n) {
        int digits = nombreDeChiffres(n);
        int copie = n, somme = 0;
        while (copie > 0) {
            int chiffre = copie % 10;
            somme += (int) Math.pow(chiffre, digits);
            copie /= 10;
        }
        return somme == n;
    }

    public static void main(String[] args) {
        System.out.println("Somme chiffres 1234 : " + sommeChiffres(1234));
        System.out.println("Nb chiffres 9876    : " + nombreDeChiffres(9876));

        System.out.println("\nNombres d'Armstrong de 1 à 500 :");
        for (int i = 1; i <= 500; i++) {
            if (estArmstrong(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}