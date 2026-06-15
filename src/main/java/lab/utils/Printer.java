package lab.utils;

public class Printer {
    public static void header(String title) {
        System.out.println("\n=== " + title + " ===");
    }

    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void result(String label, Object value) {
        System.out.println("[RESULT] " + label + ": " + value);
    }
}
