package lesson_20_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private double fuelTankFill;
    private double fuelConsumptionPer100Km;
    private LocalDate nextTechnicalInspectionDate;

    public boolean canDrive() {
        return fuelTankFill > 0;
    }

    public boolean isAllowedToOperate() {
        return !LocalDate.now().isAfter(nextTechnicalInspectionDate);
    }

    public double getPossibleDistance() {
        if (fuelConsumptionPer100Km <= 0) {
            return 0;
        }

        return fuelTankFill / fuelConsumptionPer100Km * 100;
    }
}
