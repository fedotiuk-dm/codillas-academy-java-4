package lesson_38_Generics_Lambda;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main() {
        List<Integer> numbers = List.of(3, 2, 4, 2, 3, 4, 5, 6);
        List<Integer> uniqueNumbers = CollectionUtils.keepFirstOccurrences(numbers);

        System.out.println("Original numbers: " + numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);

        Map<String, Integer> firstMap = new LinkedHashMap<>();
        firstMap.put("a", 3);
        firstMap.put("c", 4);

        Map<String, Integer> secondMap = new LinkedHashMap<>();
        secondMap.put("b", 2);
        secondMap.put("c", 3);

        Map<String, Integer> mergedMap = CollectionUtils.mergeMaps(firstMap, secondMap);

        System.out.println("First map: " + firstMap);
        System.out.println("Second map: " + secondMap);
        System.out.println("Merged map: " + mergedMap);
    }
}
