package lab.exercises.oop;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Aire : " + rectangle.aire());
        System.out.println("Périmètre : " + rectangle.perimetre());
    }
}
