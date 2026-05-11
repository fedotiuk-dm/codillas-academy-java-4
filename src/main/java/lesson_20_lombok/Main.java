package lesson_20_lombok;

import lombok.extern.java.Log;

import java.time.LocalDate;

@Log
public class Main {

    public static void main() {
        Car car = new Car(25, 8.5, LocalDate.of(2027, 5, 11));

        log.info(car.toString());
        log.info("Машина може їхати: " + car.canDrive());
        log.info("Машина допущена до експлуатації: " + car.isAllowedToOperate());
        log.info("Скільки машина може проїхати: " + car.getPossibleDistance() + " км");
    }
}
