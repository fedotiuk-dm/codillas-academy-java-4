package lesson_37_collections;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("NumberUtils")
class NumberUtilsTest {

    @Test
    @DisplayName("should return sum of numbers")
    void shouldReturnSumOfNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = NumberUtils.getSum(numbers);

        assertThat(sum).isEqualTo(15);
    }

    @Test
    @DisplayName("should multiply odd numbers by two")
    void shouldMultiplyOddNumbersByTwo() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> multipliedOddNumbers = NumberUtils.multiplyOddNumber(numbers);

        assertThat(multipliedOddNumbers).containsExactly(2, 6, 10);
    }

    @Test
    @DisplayName("should return empty list when there are no odd numbers")
    void shouldReturnEmptyListWhenThereAreNoOddNumbers() {
        List<Integer> numbers = List.of(2, 4, 6);

        List<Integer> multipliedOddNumbers = NumberUtils.multiplyOddNumber(numbers);

        assertThat(multipliedOddNumbers).isEmpty();
    }
}
