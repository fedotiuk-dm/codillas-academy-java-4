package lesson_38_Generics_Lambda;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CollectionUtils")
class CollectionUtilsTest {

    @Test
    @DisplayName("should keep only first occurrence of every number")
    void shouldKeepOnlyFirstOccurrenceOfEveryNumber() {
        List<Integer> numbers = List.of(3, 2, 4, 2, 3, 4, 5, 6);

        List<Integer> uniqueNumbers = CollectionUtils.keepFirstOccurrences(numbers);

        assertThat(uniqueNumbers).containsExactly(3, 2, 4, 5, 6);
    }

    @Test
    @DisplayName("should return empty list when input list is empty")
    void shouldReturnEmptyListWhenInputListIsEmpty() {
        List<Integer> numbers = List.of();

        List<Integer> uniqueNumbers = CollectionUtils.keepFirstOccurrences(numbers);

        assertThat(uniqueNumbers).isEmpty();
    }

    @Test
    @DisplayName("should keep only first occurrence of every number with lambda")
    void shouldKeepOnlyFirstOccurrenceOfEveryNumberWithLambda() {
        List<Integer> numbers = List.of(3, 2, 4, 2, 3, 4, 5, 6);

        List<Integer> uniqueNumbers = CollectionUtils.keepFirstOccurrencesWithLambda(numbers);

        assertThat(uniqueNumbers).containsExactly(3, 2, 4, 5, 6);
    }

    @Test
    @DisplayName("should merge maps and sum values for repeated keys")
    void shouldMergeMapsAndSumValuesForRepeatedKeys() {
        Map<String, Integer> firstMap = new LinkedHashMap<>();
        firstMap.put("a", 3);
        firstMap.put("c", 4);

        Map<String, Integer> secondMap = new LinkedHashMap<>();
        secondMap.put("b", 2);
        secondMap.put("c", 3);

        Map<String, Integer> mergedMap = CollectionUtils.mergeMaps(firstMap, secondMap);

        assertThat(mergedMap)
                .containsEntry("a", 3)
                .containsEntry("b", 2)
                .containsEntry("c", 7)
                .hasSize(3);
    }

    @Test
    @DisplayName("should merge maps and sum values for repeated keys with lambda")
    void shouldMergeMapsAndSumValuesForRepeatedKeysWithLambda() {
        Map<String, Integer> firstMap = new LinkedHashMap<>();
        firstMap.put("a", 3);
        firstMap.put("c", 4);

        Map<String, Integer> secondMap = new LinkedHashMap<>();
        secondMap.put("b", 2);
        secondMap.put("c", 3);

        Map<String, Integer> mergedMap = CollectionUtils.mergeMapsWithLambda(firstMap, secondMap);

        assertThat(mergedMap)
                .containsEntry("a", 3)
                .containsEntry("b", 2)
                .containsEntry("c", 7)
                .hasSize(3);
    }
}
