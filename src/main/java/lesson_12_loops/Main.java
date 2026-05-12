package lesson_12_loops;

public class Main {

    void main() {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
