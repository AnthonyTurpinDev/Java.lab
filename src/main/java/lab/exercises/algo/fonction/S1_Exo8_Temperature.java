// S1_Exo8_Temperature.java
// Énoncé : Crée 4 fonctions de conversion :
//          celsiusVers Fahrenheit(double c) → double
//          fahrenheitVersCelsius(double f) → double
//          celsiusVersKelvin(double c) → double
//          kelvinVersCelsius(double k) → double
//          Affiche un tableau de conversion de 0°C à 100°C (par pas de 10).

public class S1_Exo8_Temperature {

    static double celsiusVersFahrenheit(double c) { return c * 9.0 / 5.0 + 32; }
    static double fahrenheitVersCelsius(double f) { return (f - 32) * 5.0 / 9.0; }
    static double celsiusVersKelvin(double c)     { return c + 273.15; }
    static double kelvinVersCelsius(double k)     { return k - 273.15; }

    public static void main(String[] args) {
        System.out.printf("%-8s %-12s %-10s%n", "Celsius", "Fahrenheit", "Kelvin");
        System.out.println("-".repeat(32));
        for (int c = 0; c <= 100; c += 10) {
            System.out.printf("%-8d %-12.1f %-10.2f%n",
                c, celsiusVersFahrenheit(c), celsiusVersKelvin(c));
        }
    }
}