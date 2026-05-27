package lesson_30_stack;

public interface Stackable {

    boolean isEmpty();

    boolean isFull();

    void addElementToStack(int element);

    int deleteElementFromStack();

    int readTop();
}
