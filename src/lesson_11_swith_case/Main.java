package lesson_11_swith_case;

public class Main {

    static void main() {

        String day = "7";

        String result = switch (day) {
            case "1" -> "Понеділок";
            case "2" -> "Вівторок";
            case "3" -> "Середа";
            case "4" -> "Четвер";
            case "5" -> "П'ятниця";
            case "6" -> "Субота";
            case "7" -> {
                String dayName = "Неділя";
                int dayLength = dayName.length();
                yield String.valueOf(dayLength); // конвертація int -> String щоб показати dayLength
            }
            default -> "Wrong day";

        };
        System.out.println(result);
    }
}