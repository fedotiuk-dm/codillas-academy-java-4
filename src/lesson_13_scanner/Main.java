package lesson_13_scanner;

import java.util.Scanner;

public class Main {
    void main() {
        Scanner console = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = console.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введіть елемент масиву " + i + ": ");
            numbers[i] = console.nextInt();
        }

        int choice;
        do {
            System.out.println();
            System.out.println("Меню:");
            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне всіх елементів");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Завершити програму");
            System.out.print("Оберіть пункт меню: ");
            choice = console.nextInt();

            int sum = 0;
            for (int number : numbers)
                sum += number;

            switch (choice) {
                case 1 -> System.out.println("Сума всіх елементів = " + sum);
                case 2 ->
                        System.out.println("Середнє арифметичне значення елементу = " + (double) sum / numbers.length);
                case 3 -> {
                    int max = numbers[0];
                    for (int i = 1; i < numbers.length; i++) {
                        if (numbers[i] > max) {
                            max = numbers[i];
                        }
                    }
                    System.out.println("Максимальне значення елементу = " + max);
                }
                case 4 -> System.out.println("Програму завершено!");
                default -> System.out.println("Такого значення не існує!");
            }

        }
        while (choice != 4);

    }
}
