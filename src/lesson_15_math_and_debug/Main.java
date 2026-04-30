package lesson_15_math_and_debug;

public class Main {

    void main() {
        int min = min(3, 5);
        System.out.println(min);
        int max = max(3, 5);
        System.out.println(max);
        int absolute = abs(-3);
        System.out.println(absolute);
        int power = pow(3, 5);
        System.out.println(power);
        int round = round(3.5);
        System.out.println(round);
    }

    public static int min(int first, int second) {
        if (first < second) {
            return first;
        }
        return second;
    }

    public static int max(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public static int abs(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int round(double number) {
        int whole = (int) number;
        double fraction = number - whole;

        if (fraction >= 0.5) {
            return whole + 1;
        }
        return whole;
    }
}
