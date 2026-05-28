package lesson_30_stack;

public class StackFullException extends RuntimeException {

    public StackFullException(int element) {
        super("Стек повний. Неможливо додати елемент: " + element);
    }
}
