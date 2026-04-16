package lesson_8_boolean;

public class Main {

    void main() {

        // ! - заперечення
        boolean a = true;
        System.out.println(a);
        boolean b = !a;
        System.out.println(b);

        // && амперсант - оператор "і"укр
        System.out.println("Оператор &&");
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);

        // || - оператор "або"
        System.out.println("Оператор");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);


        // Застосування
        System.out.println("Застосування");
        System.out.println(5 > 3); // true
        boolean resultOfDenial = !(5 > 3);
        System.out.println(resultOfDenial);

        System.out.println("Застосування оператор і");
        System.out.println((5 > 3) && (1 > 2)); // false
        System.out.println((5 > 3) || (1 > 2)); // false
    }
}
