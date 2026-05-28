package lesson_30_stack;

public class Stack implements Stackable {

    private final int maxSize;
    private final int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void addElementToStack(int element) {
        if (isFull()) {
            throw new StackFullException(element);
        }
        stackArray[++top] = element;
    }

    @Override
    public int deleteElementFromStack() {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return stackArray[top--];
    }

    @Override
    public int readTop() {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
