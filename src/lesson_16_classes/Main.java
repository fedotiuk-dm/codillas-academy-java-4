package lesson_16_classes;

import lesson_16_classes.animals.Dragon;

import java.util.Scanner;

public class Main {
    static void main() {

        Dragon drako = new Dragon();
        drako.setName("Drago");
        drako.setAge(30);
        drako.setWeight(123.57);

        System.out.println("Ім'я дракона: " + drako.getName());
        System.out.println("Вік дракона: " + drako.getAge());
        System.out.println("Вага дракона: " + drako.getWeight());

        Dragon drag = new Dragon("Drag", 12, 123.44);

        System.out.println("Ім'я дракона: " + drag.getName());
        System.out.println("Вік дракона: " + drag.getAge());
        System.out.println("Вага дракона: " + drag.getWeight());

        //task 6:
        Dragon[] dragons = new Dragon[3];

        Scanner console = new Scanner(System.in);

        for (int i = 0; i < dragons.length; i++) {
            System.out.println("Введіть ім'я дракона: ");
            String name = console.next();

            System.out.println("Введіть вік дракона: ");
            int age = console.nextInt();

            System.out.println("Введіть вагу дракона: ");
            double weight = console.nextDouble();
            dragons[i] = new Dragon(name, age, weight);
        }

        for (int i = 0; i < dragons.length; i++) {
            System.out.println("Дракон: " +
                    "Імя дракона: " + dragons[i].getName() + ", " +
                    "Вік дракона: " + dragons[i].getAge() + ", " +
                    "Вага дракона: " + dragons[i].getWeight());
        }
    }
}
