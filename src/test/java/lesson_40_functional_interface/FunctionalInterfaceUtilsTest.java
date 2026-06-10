package lesson_40_functional_interface;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.DayOfWeek;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("FunctionalInterfaceUtils")
class FunctionalInterfaceUtilsTest {

    @Test
    @DisplayName("should check whether number is prime")
    void shouldCheckWhetherNumberIsPrime() {
        Predicate<Integer> primeNumberPredicate = FunctionalInterfaceUtils.primeNumberPredicate();

        assertThat(primeNumberPredicate.test(2)).isTrue();
        assertThat(primeNumberPredicate.test(7)).isTrue();
        assertThat(primeNumberPredicate.test(1)).isFalse();
        assertThat(primeNumberPredicate.test(9)).isFalse();
    }

    @Test
    @DisplayName("should print random number from zero to max number")
    void shouldPrintRandomNumberFromZeroToMaxNumber() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(outputStream);
        Consumer<Integer> randomNumberConsumer = FunctionalInterfaceUtils.randomNumberConsumer(new Random(1), output);

        randomNumberConsumer.accept(10);

        int printedNumber = Integer.parseInt(outputStream.toString().trim());
        assertThat(printedNumber).isBetween(0, 10);
    }

    @Test
    @DisplayName("should not print random number when max number is negative")
    void shouldNotPrintRandomNumberWhenMaxNumberIsNegative() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(outputStream);
        Consumer<Integer> randomNumberConsumer = FunctionalInterfaceUtils.randomNumberConsumer(new Random(1), output);

        assertThatThrownBy(() -> randomNumberConsumer.accept(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Max number must be greater than or equal to 0");
        assertThat(outputStream.toString()).isEmpty();
    }

    @Test
    @DisplayName("should return random day of week")
    void shouldReturnRandomDayOfWeek() {
        Supplier<DayOfWeek> randomDayOfWeekSupplier = FunctionalInterfaceUtils.randomDayOfWeekSupplier();

        DayOfWeek dayOfWeek = randomDayOfWeekSupplier.get();

        assertThat(dayOfWeek).isIn((Object[]) DayOfWeek.values());
    }

    @Test
    @DisplayName("should round double to long")
    void shouldRoundDoubleToLong() {
        Function<Double, Long> roundDoubleToLongFunction = FunctionalInterfaceUtils.roundDoubleToLongFunction();

        assertThat(roundDoubleToLongFunction.apply(5.4)).isEqualTo(5L);
        assertThat(roundDoubleToLongFunction.apply(5.5)).isEqualTo(6L);
        assertThat(roundDoubleToLongFunction.apply(5.6)).isEqualTo(6L);
    }

    @Test
    @DisplayName("should calculate fibonacci number")
    void shouldCalculateFibonacciNumber() {
        UnaryOperator<Integer> fibonacciUnaryOperator = FunctionalInterfaceUtils.fibonacciUnaryOperator();

        assertThat(fibonacciUnaryOperator.apply(0)).isZero();
        assertThat(fibonacciUnaryOperator.apply(1)).isEqualTo(1);
        assertThat(fibonacciUnaryOperator.apply(7)).isEqualTo(13);
    }

    @Test
    @DisplayName("should not calculate fibonacci number when number is negative")
    void shouldNotCalculateFibonacciNumberWhenNumberIsNegative() {
        UnaryOperator<Integer> fibonacciUnaryOperator = FunctionalInterfaceUtils.fibonacciUnaryOperator();

        assertThatThrownBy(() -> fibonacciUnaryOperator.apply(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Number must be greater than or equal to 0");
    }
}
