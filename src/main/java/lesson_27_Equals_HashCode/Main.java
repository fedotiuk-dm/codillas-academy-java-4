package lesson_27_Equals_HashCode;

public class Main {

    static void main() {
        Dragon firstDragon = new Dragon("Drago", 30, 123.57, "Roar", "Fire", "ARGON");
        Dragon secondDragon = new Dragon("Drago", 30, 123.57, "Roar", "Fire", "ARGON");
        Dragon thirdDragon = new Dragon("Drag", 12, 100.25, "Grrr", "Small fire", "DRABON");

        System.out.println("Перший дракон:");
        System.out.println(firstDragon);

        System.out.println("Другий дракон:");
        System.out.println(secondDragon);

        System.out.println("Третій дракон:");
        System.out.println(thirdDragon);

        boolean firstAndSecondAreEquals = firstDragon.equals(secondDragon);
        boolean firstAndThirdAreEquals = firstDragon.equals(thirdDragon);

        System.out.println("firstDragon.equals(secondDragon): " + firstAndSecondAreEquals);
        System.out.println("firstDragon.hashCode(): " + firstDragon.hashCode());
        System.out.println("secondDragon.hashCode(): " + secondDragon.hashCode());

        System.out.println("firstDragon.equals(thirdDragon): " + firstAndThirdAreEquals);
        System.out.println("thirdDragon.hashCode(): " + thirdDragon.hashCode());
    }
}
