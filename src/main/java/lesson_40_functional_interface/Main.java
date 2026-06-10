package lesson_40_functional_interface;

import java.time.DayOfWeek;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main() {
        Predicate<Integer> primeNumberPredicate = FunctionalInterfaceUtils.primeNumberPredicate();
        Consumer<Integer> randomNumberConsumer = FunctionalInterfaceUtils.randomNumberConsumer();
        Supplier<DayOfWeek> randomDayOfWeekSupplier = FunctionalInterfaceUtils.randomDayOfWeekSupplier();
        Function<Double, Long> roundDoubleToLongFunction = FunctionalInterfaceUtils.roundDoubleToLongFunction();
        UnaryOperator<Integer> fibonacciUnaryOperator = FunctionalInterfaceUtils.fibonacciUnaryOperator();

        System.out.println("Is 7 prime: " + primeNumberPredicate.test(7));
        System.out.print("Random number from 0 to 10: ");
        randomNumberConsumer.accept(10);
        System.out.println("Random day of week: " + randomDayOfWeekSupplier.get());
        System.out.println("Rounded 5.6: " + roundDoubleToLongFunction.apply(5.6));
        System.out.println("Fibonacci number 7: " + fibonacciUnaryOperator.apply(7));
    }
}
