package lesson_30_stack;

public class Main {

    public static void main() {
        Stack theStack = new Stack(4);

        theStack.addElementToStack(89);
        theStack.addElementToStack(69);
        theStack.addElementToStack(45);
        theStack.addElementToStack(34);

        System.out.println("Верхній елемент: " + theStack.readTop());

        try {
            theStack.addElementToStack(100);
        } catch (StackFullException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.print("Наш стек: ");
        while (!theStack.isEmpty()) {
            int value = theStack.deleteElementFromStack();
            System.out.print(value + " ");
        }
        System.out.println();

        try {
            theStack.deleteElementFromStack();
        } catch (StackEmptyException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
