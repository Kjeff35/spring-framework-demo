package org.example.services.impl.repairs;

import lombok.ToString;
import org.example.services.CarRepairType;
import org.springframework.stereotype.Service;

/**
 * Represents a repair type for the car's sound system.
 * <p>
 * This class implements the {@link CarRepairType} interface and provides the repair logic for the sound system.
 * It performs the necessary actions to repair the sound system component of the car.
 * </p>
 */
@Service
@ToString
public class SoundSystemRepair implements CarRepairType {

    public void performRepair() {
        System.out.println("Performing sound system repair...");
    }
}
