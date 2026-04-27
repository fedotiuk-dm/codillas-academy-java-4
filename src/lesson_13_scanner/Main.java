package lesson_13_scanner;

import java.util.Scanner;

public class Main {
    void main() {
        Scanner console = new Scanner(System.in);

        System.out.print("Введіть розмір масиву N: ");
        int sizeN = console.nextInt();
        System.out.print("Введіть розмір масиву M: ");
        int sizeM = console.nextInt();

        int[][] numbers = new int[sizeN][sizeM];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Введіть елемент масиву [N" + i + "][M" + j + "]: ");
                numbers[i][j] = console.nextInt();
            }
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
            for (int[] row : numbers) {
                for (int number : row) {
                    sum += number;
                }
            }

            switch (choice) {
                case 1 -> System.out.println("Сума всіх елементів = " + sum);
                case 2 ->
                        System.out.println("Середнє арифметичне значення елементу = " + (double) sum / (sizeN * sizeM));
                case 3 -> {
                    int max = numbers[0][0];
                    for (int i = 1; i < numbers.length; i++) {
                        for (int j = 0; j < numbers.length; j++) {
                            if (numbers[i][j] > max) {
                                max = numbers[i][j];
                            }
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
