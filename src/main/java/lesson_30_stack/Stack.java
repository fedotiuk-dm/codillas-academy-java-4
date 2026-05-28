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
            System.out.println("Стек повний. Неможливо додати елемент: " + element);
            return;
        }
        stackArray[++top] = element;
    }

    @Override
    public int deleteElementFromStack() {
        if (isEmpty()) {
            System.out.println("Стек порожній: Неможливо дістати елемент: " + top);
            return -1;
        }
        return stackArray[top--];
    }

    @Override
    public int readTop() {
        if (isEmpty()) {
            System.out.println("Стек порожній. Немає верхнього елемента: " + top);
            return -1;
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
