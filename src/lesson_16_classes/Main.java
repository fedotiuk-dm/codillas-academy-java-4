package lesson_16_classes;

import lesson_16_classes.animals.Dragon;

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
    }
}
