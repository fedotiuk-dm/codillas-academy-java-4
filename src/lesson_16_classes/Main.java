package lesson_16_classes;

import lesson_16_classes.animals.Dragon;

import java.util.Scanner;

public class Main {
    static void main() {

        Dragon drako = new Dragon();
        drako.setName("Drago");
        drako.setAge(30);
        drako.setWeight(123.57);
        drako.setVoice("Blablabalbalbalbalbalabl");
        drako.setFire("Fireeeeeeeeeeee!");

        System.out.println("Ім'я дракона: " + drako.getName());
        System.out.println("Вік дракона: " + drako.getAge());
        System.out.println("Вага дракона: " + drako.getWeight());

        Dragon drag = new Dragon("Drag", 12, 123.44, null, null);

        System.out.println("Ім'я дракона: " + drag.getName());
        System.out.println("Вік дракона: " + drag.getAge());
        System.out.println("Вага дракона: " + drag.getWeight());
        System.out.println("Дракон каже: " + drag.getVoice());
        System.out.println("Дракон випускає вогонь: " + drag.getFire());

        //task 6:
        Dragon[] dragons = new Dragon[3];

        Scanner console = new Scanner(System.in);

        for (int i = 0; i < dragons.length; i++) {
            System.out.println("Введіть ім'я дракона: ");
            String name = console.nextLine();

            System.out.println("Введіть вік дракона: ");
            int age = console.nextInt();

            System.out.println("Введіть вагу дракона: ");
            double weight = console.nextDouble();
            console.nextLine();

            System.out.println("Дракон може сказати: ");
            String voice = console.nextLine();

            System.out.println("Дракон може випускати вогонь: ");
            String fire = console.nextLine();

            dragons[i] = new Dragon(name, age, weight, voice, fire);
        }

        for (int i = 0; i < dragons.length; i++) {
            System.out.println(dragons[i]);
        }
    }
}
