package lesson_10_if_else;

import java.util.Arrays;

public class Main {
    static void main() {

        /*
          Написати програму що:
          - робить останній елемент масиву додатнім
          - робить елемент масиву під індексом 0 вдвічі більшим
        */

        int[] numbers = {41, 2, -4, -5, -3};

        int lastNumberIdx = numbers.length -1;

        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        numbers[0] = firstNumber * 2;
        numbers[lastNumberIdx] = lastNumber * 2;

        if (lastNumber < 0) {
            numbers[lastNumberIdx] = lastNumber * -1;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
