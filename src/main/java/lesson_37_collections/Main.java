package lesson_37_collections;

import java.util.List;

public class Main {

    public static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + NumberUtils.getSum(numbers));
        System.out.println("Odd numbers multiplied by 2: " + NumberUtils.multiplyOddNumber(numbers));
    }
}
