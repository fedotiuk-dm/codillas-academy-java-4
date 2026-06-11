package lesson_41_comparator_comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CarUtils {
    private static final Comparator<Car> ENGINE_CAPACITY_COMPARATOR = Comparator
    // method reference :: використовується, коли lambda просто викликає вже існуючий метод. Це коротший
    // запис lambda-виразу.
            .comparingDouble(Car::engineCapacity)
            .thenComparingInt(Car::yearOfManufacture);

    private CarUtils() {
        /* This utility class should not be instantiated */
    }

    public static List<Car> sortByYearOfManufacture(Collection<Car> cars) {
        List<Car> sortedCars = new ArrayList<>(cars);
        sortedCars.sort(null);
        return sortedCars;
    }

    public static TreeSet<Car> createTreeSetSortedByEngineCapacity(Collection<Car> cars) {
        TreeSet<Car> sortedCars = new TreeSet<>(ENGINE_CAPACITY_COMPARATOR);
        sortedCars.addAll(cars);
        return sortedCars;
    }
}
