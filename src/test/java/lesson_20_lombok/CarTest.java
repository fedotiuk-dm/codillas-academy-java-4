package lesson_20_lombok;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Car")
class CarTest {

    private static final LocalDate FUTURE = LocalDate.now().plusYears(1);
    private static final LocalDate PAST = LocalDate.now().minusYears(1);

    @Nested
    @DisplayName("canDrive()")
    class CanDrive {

        @Test
        @DisplayName("should return true when tank is not empty")
        void shouldReturnTrueWhenTankIsNotEmpty() {
            var car = new Car(10, 8.5, FUTURE);

            assertThat(car.canDrive()).isTrue();
        }

        @Test
        @DisplayName("should return false when tank is empty")
        void shouldReturnFalseWhenTankIsEmpty() {
            var car = new Car(0, 8.5, FUTURE);

            assertThat(car.canDrive()).isFalse();
        }
    }

    @Nested
    @DisplayName("isAllowedToOperate()")
    class IsAllowedToOperate {

        @Test
        @DisplayName("should return true when inspection date is in the future")
        void shouldReturnTrueWhenInspectionDateIsInFuture() {
            var car = new Car(10, 8.5, FUTURE);

            assertThat(car.isAllowedToOperate()).isTrue();
        }

        @Test
        @DisplayName("should return false when inspection date is in the past")
        void shouldReturnFalseWhenInspectionDateIsInPast() {
            var car = new Car(10, 8.5, PAST);

            assertThat(car.isAllowedToOperate()).isFalse();
        }
    }

    @Nested
    @DisplayName("getPossibleDistance()")
    class GetPossibleDistance {

        @Test
        @DisplayName("should calculate distance with clean numbers")
        void shouldCalculateDistanceWithCleanNumbers() {
            var car = new Car(50, 10, FUTURE);

            assertThat(car.getPossibleDistance()).isEqualTo(500.0);
        }

        @Test
        @DisplayName("should calculate distance with realistic values")
        void shouldCalculateDistanceWithRealisticValues() {
            var car = new Car(25, 8.5, FUTURE);

            assertThat(car.getPossibleDistance()).isCloseTo(294.12, within(0.01));
        }

        @Test
        @DisplayName("should return zero when consumption is zero")
        void shouldReturnZeroWhenConsumptionIsZero() {
            var car = new Car(25, 0, FUTURE);

            assertThat(car.getPossibleDistance()).isZero();
        }
    }
}
