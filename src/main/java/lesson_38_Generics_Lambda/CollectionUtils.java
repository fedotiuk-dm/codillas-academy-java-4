package lesson_38_Generics_Lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public static Map<String, Integer> mergeMaps(Map<String, Integer> firstMap, Map<String, Integer> secondMap) {
        Map<String, Integer> mergedMap = new LinkedHashMap<>(firstMap);

        for (Map.Entry<String, Integer> entry : secondMap.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }
}
