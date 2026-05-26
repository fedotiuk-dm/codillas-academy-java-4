package lesson_28_inc_inh;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Shape inheritance")
class ShapeTest {

    @Nested
    @DisplayName("calculateArea()")
    class CalculateArea {

        @Test
        @DisplayName("should calculate circle area")
        void shouldCalculateCircleArea() {
            var circle = new Circle(5);

            assertThat(circle.calculateArea()).isCloseTo(Math.PI * 25, within(0.001));
        }

        @Test
        @DisplayName("should calculate rectangle area")
        void shouldCalculateRectangleArea() {
            var rectangle = new Rectangle(4, 6);

            assertThat(rectangle.calculateArea()).isEqualTo(24);
        }

        @Test
        @DisplayName("should calculate square area using rectangle logic")
        void shouldCalculateSquareAreaUsingRectangleLogic() {
            var square = new Square(3);

            assertThat(square).isInstanceOf(Rectangle.class);
            assertThat(square.calculateArea()).isEqualTo(9);
        }

        @Test
        @DisplayName("should return zero for base shape")
        void shouldReturnZeroForBaseShape() {
            var shape = new Shape();

            assertThat(shape.calculateArea()).isZero();
        }
    }
}
