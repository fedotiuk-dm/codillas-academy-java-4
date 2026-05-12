package lesson_19_recursion;

public class Math {

    // 1: Найпростіша рекурсія
    static void countdown(int n) {
        if (n == 0) {
            System.out.println("start");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    // 2: Факторіал
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 3: Сума чисел від 1 до n
    static int sumToN(int n) {
        if (n == 0) {
            return 1;
        }
        return n + sumToN(n - 1);
    }

    // 4: Степінь числа
    static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

//    // 5: Фібоначчі, базова версія
//    static int fib(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }

    // Більш реальні приклади.

    // Кешування (memoization)
    static int fib(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (memo[n] != 0) return memo[n];

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }

    // Ітеративна версія
    static int fibLoop(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

}
