package org.example.services.impl.repairs;

import lombok.ToString;
import org.example.services.CarRepairType;
import org.springframework.stereotype.Service;

/**
 * Represents a repair type for the car's engine.
 * <p>
 * This class implements the {@link CarRepairType} interface and provides the repair logic for the engine.
 * It performs the necessary actions to repair the engine component of the car.
 * </p>
 */
@Service
@ToString
public class EngineRepair implements CarRepairType {

    public void performRepair() {
        System.out.println("Performing engine repair...");
    }
}
