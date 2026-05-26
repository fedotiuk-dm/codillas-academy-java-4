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
            Shape circle = new Circle(5);

            assertThat(circle.calculateArea()).isCloseTo(Math.PI * 25, within(0.001));
        }

        @Test
        @DisplayName("should calculate rectangle area")
        void shouldCalculateRectangleArea() {
            Shape rectangle = new Rectangle(4, 6);

            assertThat(rectangle.calculateArea()).isEqualTo(24);
        }

        @Test
        @DisplayName("should calculate square area using rectangle logic")
        void shouldCalculateSquareAreaUsingRectangleLogic() {
            Shape square = new Square(3);

            assertThat(square).isInstanceOf(Rectangle.class);
            assertThat(square.calculateArea()).isEqualTo(9);
        }
    }

    @Nested
    @DisplayName("calculatePerimeter()")
    class CalculatePerimeter {

        @Test
        @DisplayName("should calculate circle perimeter")
        void shouldCalculateCirclePerimeter() {
            // given
            Shape circle = new Circle(5);

            // when
            double perimeter = circle.calculatePerimeter();

            // then
            assertThat(perimeter).isCloseTo(2 * Math.PI * 5, within(0.001));
        }

        @Test
        @DisplayName("should calculate rectangle perimeter")
        void shouldCalculateRectanglePerimeter() {
            // given
            Shape rectangle = new Rectangle(4, 6);

            // when
            double perimeter = rectangle.calculatePerimeter();

            // then
            assertThat(perimeter).isEqualTo(20);
        }

        @Test
        @DisplayName("should calculate square perimeter")
        void shouldCalculateSquarePerimeter() {
            // given
            Shape square = new Square(3);

            // when
            double perimeter = square.calculatePerimeter();

            // then
            assertThat(perimeter).isEqualTo(12);
        }
    }
}
