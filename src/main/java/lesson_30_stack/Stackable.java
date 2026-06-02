package lesson_30_stack;

import java.util.Optional;

public interface Stackable {

    boolean isEmpty();

    boolean isFull();

    void addElementToStack(int element);

    int deleteElementFromStack();

    Optional<Integer> deleteElementFromStackOptional();

    int readTop();
}
