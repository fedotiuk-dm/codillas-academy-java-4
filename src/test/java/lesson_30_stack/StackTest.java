package lesson_30_stack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Stack")
class StackTest {

    @Nested
    @DisplayName("addElementToStack()")
    class AddElementToStack {

        @Test
        @DisplayName("should throw exception when stack is full")
        void shouldThrowExceptionWhenStackIsFull() {
            Stack stack = new Stack(1);
            stack.addElementToStack(89);

            assertThatThrownBy(() -> stack.addElementToStack(69))
                    .isInstanceOf(StackFullException.class)
                    .hasMessage("Стек повний. Неможливо додати елемент: 69");
        }
    }

    @Nested
    @DisplayName("deleteElementFromStack()")
    class DeleteElementFromStack {

        @Test
        @DisplayName("should return top element and remove it")
        void shouldReturnTopElementAndRemoveIt() {
            Stack stack = new Stack(2);
            stack.addElementToStack(89);
            stack.addElementToStack(69);

            int deletedElement = stack.deleteElementFromStack();

            assertThat(deletedElement).isEqualTo(69);
            assertThat(stack.readTop()).isEqualTo(89);
        }

        @Test
        @DisplayName("should throw exception when stack is empty")
        void shouldThrowExceptionWhenStackIsEmpty() {
            Stack stack = new Stack(1);

            assertThatThrownBy(stack::deleteElementFromStack)
                    .isInstanceOf(StackEmptyException.class)
                    .hasMessage("Стек порожній.");
        }
    }

    @Nested
    @DisplayName("deleteElementFromStackOptional()")
    class DeleteElementFromStackOptional {

        @Test
        @DisplayName("should return top element and remove it when stack is not empty")
        void shouldReturnTopElementAndRemoveItWhenStackIsNotEmpty() {
            Stack stack = new Stack(2);
            stack.addElementToStack(89);
            stack.addElementToStack(69);

            assertThat(stack.deleteElementFromStackOptional()).contains(69);
            assertThat(stack.readTop()).isEqualTo(89);
        }

        @Test
        @DisplayName("should return empty optional when stack is empty")
        void shouldReturnEmptyOptionalWhenStackIsEmpty() {
            Stack stack = new Stack(1);

            assertThat(stack.deleteElementFromStackOptional()).isEmpty();
        }
    }

    @Nested
    @DisplayName("readTop()")
    class ReadTop {

        @Test
        @DisplayName("should return top element without removing it")
        void shouldReturnTopElementWithoutRemovingIt() {
            Stack stack = new Stack(2);
            stack.addElementToStack(89);
            stack.addElementToStack(69);

            int topElement = stack.readTop();

            assertThat(topElement).isEqualTo(69);
            assertThat(stack.deleteElementFromStack()).isEqualTo(69);
        }

        @Test
        @DisplayName("should throw exception when stack is empty")
        void shouldThrowExceptionWhenStackIsEmpty() {
            Stack stack = new Stack(1);

            assertThatThrownBy(stack::readTop)
                    .isInstanceOf(StackEmptyException.class)
                    .hasMessage("Стек порожній.");
        }
    }
}
