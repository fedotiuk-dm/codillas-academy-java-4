package lesson_28_inc_inh;

public class Main {

    public static void main() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(3);

        circle.displayInfo();
        System.out.println();

        rectangle.displayInfo();
        System.out.println();

        square.displayInfo();
    }
}
