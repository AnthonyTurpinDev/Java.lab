package lab.exercises.algo;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        double convertedBack = (fahrenheit - 32) * 5 / 9;

        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(fahrenheit + "°F = " + convertedBack + "°C");
    }
}
