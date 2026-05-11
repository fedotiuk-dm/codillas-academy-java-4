package lesson_7_string;

public class Main {

    void main() {

        // create a string with constructor
        String s1 = new String("Hello");

        System.out.println(s1);

        // preferred approach: create a string with =
        String s2 = new String("World!");
        System.out.println(s2);

        // string concatenation
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        // for Windows: cpmmand - ctrl, option - alt

        // Ctr + D - дублювання
        // Alt + Ctrl + L - форматування
        // Alt + Ctrl + Shift + L
        // Ctrl + Shift + стрілочка вгору/вниз - міняти місцями стрічку коду
    }
}
