package lesson_28_inc_inh;

public class Rectangle extends Shape {

    protected final double width;
    protected final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип фігури: прямокутник");
        System.out.println("Ширина: " + width);
        System.out.println("Висота: " + height);
        System.out.println("Площа: " + calculateArea());
    }
}
