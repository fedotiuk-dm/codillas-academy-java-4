package lesson_6;

public class Main {

    // static variable
    static double PI = 3.14;

    // instance variable
    int b = 5;

    void main() {
        // local variable
        int a = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(PI);
    }

    void main2() {
        System.out.println(b);
        System.out.println(PI);
    }
}