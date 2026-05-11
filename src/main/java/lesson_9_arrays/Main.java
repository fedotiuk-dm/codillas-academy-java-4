package lesson_9_arrays;

public class Main {

    void main () {

        int[] myNumbers = {1, 2, 3, 4, 5};
        System.out.println(myNumbers.length);

        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[1]);
        System.out.println(myNumbers[2]);
        System.out.println(myNumbers[3]);
        System.out.println(myNumbers[4]);

        int swap = myNumbers[0];
        myNumbers[0] = myNumbers[1];
        myNumbers[1] = swap;
        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[1]);
        System.out.println(myNumbers[2]);
        System.out.println(myNumbers[3]);
        System.out.println(myNumbers[4]);

    }
}
