package lesson_19_recursion;

public class Main {
    void main() {
//        Math.countdown(5);
//        System.out.println(Math.factorial(5));
//        System.out.println(Math.sumToN(5));
//        System.out.println(Math.power(5, 5));
//        System.out.println(Math.fibLoop(7));
        int n = 7;
        int[] memo = new int[n + 1];
        System.out.println(Math.fib(n, memo));
    }
}
