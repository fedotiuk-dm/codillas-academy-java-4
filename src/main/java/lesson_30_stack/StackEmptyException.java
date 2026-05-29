package lesson_30_stack;

public class StackEmptyException extends RuntimeException {

    public StackEmptyException() {
        super("Стек порожній.");
    }
}
