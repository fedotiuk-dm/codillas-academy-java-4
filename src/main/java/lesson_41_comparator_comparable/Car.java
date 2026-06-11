package lesson_41_comparator_comparable;

public record Car(int yearOfManufacture, double engineCapacity) implements Comparable<Car> {

    @Override
    public int compareTo(Car other) {
        int yearComparison = Integer.compare(yearOfManufacture, other.yearOfManufacture);
        if (yearComparison != 0) {
            return yearComparison;
        }

        return Double.compare(engineCapacity, other.engineCapacity);
    }
}
