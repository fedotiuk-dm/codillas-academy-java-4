package lesson_41_comparator_comparable;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CarUtils")
class CarUtilsTest {

    @Test
    @DisplayName("should sort cars by year of manufacture")
    void shouldSortCarsByYearOfManufacture() {
        List<Car> cars = List.of(
                new Car(2022, 1.8),
                new Car(2015, 2.0),
                new Car(2020, 1.6)
        );

        List<Car> sortedCars = CarUtils.sortByYearOfManufacture(cars);

        assertThat(sortedCars).containsExactly(
                new Car(2015, 2.0),
                new Car(2020, 1.6),
                new Car(2022, 1.8)
        );
        assertThat(cars).containsExactly(
                new Car(2022, 1.8),
                new Car(2015, 2.0),
                new Car(2020, 1.6)
        );
    }

    @Test
    @DisplayName("should create tree set sorted by engine capacity")
    void shouldCreateTreeSetSortedByEngineCapacity() {
        List<Car> cars = List.of(
                new Car(2022, 1.8),
                new Car(2015, 2.0),
                new Car(2020, 1.6)
        );

        TreeSet<Car> sortedCars = CarUtils.createTreeSetSortedByEngineCapacity(cars);

        assertThat(sortedCars).containsExactly(
                new Car(2020, 1.6),
                new Car(2022, 1.8),
                new Car(2015, 2.0)
        );
    }
}
