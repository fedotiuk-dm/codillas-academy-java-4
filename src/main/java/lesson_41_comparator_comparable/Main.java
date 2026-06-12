package lesson_41_comparator_comparable;

import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main() {
        List<Car> cars = List.of(
                new Car(2018, 2.0),
                new Car(2012, 1.6),
                new Car(2023, 3.0),
                new Car(2020, 1.4)
        );

        List<Car> carsSortedByYear = CarUtils.sortByYearOfManufacture(cars);
        TreeSet<Car> carsSortedByEngineCapacity = CarUtils.createTreeSetSortedByEngineCapacity(cars);

        System.out.println("Cars sorted by year: " + carsSortedByYear);
        System.out.println("Cars sorted by engine capacity: " + carsSortedByEngineCapacity);
    }
}
