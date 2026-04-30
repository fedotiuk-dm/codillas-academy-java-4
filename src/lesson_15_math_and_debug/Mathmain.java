package lesson_15_math_and_debug;


public class Mathmain {
    void main() {

        int max = Math.max(5, 10);
        System.out.println(max);

        int min = Math.min(5, 10);
        System.out.println(min);

        double sqrt = Math.sqrt(65);
        System.out.println(sqrt);

        int abs = (int) Math.abs(-4.7);
        System.out.println(abs);

        int pow = (int) Math.pow(10, 6);
        System.out.println(pow);

        int round = (int) Math.round(4.6);
        System.out.println(round);

        int ceil = (int) Math.ceil(4.6);
        System.out.println(ceil);

        int floor = (int) Math.floor(4.6);
        System.out.println(floor);

        double random = Math.round(Math.random());
        System.out.println(random);
    }
}
