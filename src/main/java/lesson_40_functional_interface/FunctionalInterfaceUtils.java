package lesson_40_functional_interface;

import java.io.PrintStream;
import java.time.DayOfWeek;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceUtils {
    private static final Random RANDOM = new Random();
    private static final DayOfWeek[] DAYS_OF_WEEK = DayOfWeek.values();

    private FunctionalInterfaceUtils() {
        /* This utility class should not be instantiated */
    }

    public static Predicate<Integer> primeNumberPredicate() {
        return number -> {
            if (number < 2) {
                return false;
            }

            for (int divider = 2; divider <= Math.sqrt(number); divider++) {
                if (number % divider == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public static Consumer<Integer> randomNumberConsumer() {
        return randomNumberConsumer(RANDOM, System.out);
    }

    public static Consumer<Integer> randomNumberConsumer(Random random, PrintStream output) {
        return maxNumber -> {
            if (maxNumber < 0) {
                throw new IllegalArgumentException("Max number must be greater than or equal to 0");
            }

            output.println(random.nextInt(maxNumber + 1));
        };
    }

    public static Supplier<DayOfWeek> randomDayOfWeekSupplier() {
        return () -> DAYS_OF_WEEK[RANDOM.nextInt(DAYS_OF_WEEK.length)];
    }

    public static Function<Double, Long> roundDoubleToLongFunction() {
        return Math::round;
    }

    public static UnaryOperator<Integer> fibonacciUnaryOperator() {
        return number -> {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be greater than or equal to 0");
            }

            if (number <= 1) {
                return number;
            }

            int previous = 0;
            int current = 1;

            for (int i = 2; i <= number; i++) {
                int next = previous + current;
                previous = current;
                current = next;
            }

            return current;
        };
    }
}
