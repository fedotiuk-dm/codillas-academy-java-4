package lesson_11_swith_case;

public class Main {

    static void main () {

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Відмінно!");
                break;
            case 'B':
                System.out.println("Добре В");
                break;
            case 'C':
                System.out.println("Добре");
                break;
            case 'D':
                System.out.println("Зараховано");
                break;
            case 'F':
                System.out.println("Спробуй ще");
                break;
            default:
                System.out.println("Неправильна оцінка");
        }
    }
}
