package org.example.services.impl.repairs;

import lombok.ToString;
import org.example.services.CarRepairType;
import org.springframework.stereotype.Service;

/**
 * Represents a repair type for the car's tire.
 * <p>
 * This class implements the {@link CarRepairType} interface and provides the repair logic for the tire.
 * It performs the necessary actions to repair the tire component of the car.
 * </p>
 */
@Service
@ToString
public class TireRepair implements CarRepairType {

    public void performRepair() {
        System.out.println("Performing tire repair...");
    }
}
