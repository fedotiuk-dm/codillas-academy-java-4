package lesson_38_Generics_Lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionUtils {
    private CollectionUtils() {
        /* This utility class should not be instantiated */
    }


    public static List<Integer> keepFirstOccurrences(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (Integer number : numbers) {
            if (seenNumbers.add(number)) {
                uniqueNumbers.add(number);
            }
        }

        return uniqueNumbers;
    }

    // lambda style
    public static List<Integer> keepFirstOccurrencesWithLambda(List<Integer> numbers) {
        Set<Integer> seenNumbers = new HashSet<>();

        return numbers.stream()
                .filter(seenNumbers::add)
                .toList();
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> firstMap, Map<String, Integer> secondMap) {
        Map<String, Integer> mergedMap = new LinkedHashMap<>(firstMap);

        for (Map.Entry<String, Integer> entry : secondMap.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }

    // lambda style, method reference :: використовується, коли lambda просто викликає вже існуючий метод. Це коротший
    // запис lambda-виразу.
    public static Map<String, Integer> mergeMapsWithLambda(
            Map<String, Integer> firstMap,
            Map<String, Integer> secondMap
    ) {
        return Stream.concat(firstMap.entrySet().stream(), secondMap.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Integer::sum,
                        LinkedHashMap::new
                ));
    }
}
