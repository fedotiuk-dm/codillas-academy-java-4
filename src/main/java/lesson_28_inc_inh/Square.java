package lesson_28_inc_inh;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип фігури: квадрат");
        System.out.println("Сторона: " + width);
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}
