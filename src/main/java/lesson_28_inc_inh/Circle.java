package lesson_28_inc_inh;


public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Тип фігури: коло");
        System.out.println("Радіус: " + radius);
        System.out.printf("Площа: %.1f%n", calculateArea());
    }
}
