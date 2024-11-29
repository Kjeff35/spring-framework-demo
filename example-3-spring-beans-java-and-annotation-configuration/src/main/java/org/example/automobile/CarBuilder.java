package org.example.automobile;

import lombok.Data;
import org.example.automobile.parts.Engine;
import org.example.automobile.parts.SoundSystem;
import org.example.automobile.parts.Tire;
import org.example.services.CarRepairType;
import org.example.services.CarRepairer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Represents a builder for creating a car with various components such as an engine,
 * tire, sound system, and a car repairer.
 * <p>
 * This class is responsible for assembling a car by injecting its dependencies,
 * such as the engine, tire, and sound system. Additionally, it allows performing
 * car repairs using the specified repair type.
 * </p>
 *
 * <p>The class is annotated with {@link Component} to be automatically detected as
 * a Spring bean and is configured with Lombok's {@link Data} to generate getters,
 * setters, {@code toString}, {@code equals}, and {@code hashCode} methods.</p>
 *
 * <p>The {@link Qualifier} annotation is used in the constructor to specify which
 * specific bean to inject when multiple beans of the same type are available in the Spring context.</p>
 *
 * <p>In this case, {@link Qualifier} is used to inject a specific {@link Tire} bean with the name
 * "fake tire" and a specific {@link SoundSystem} bean with the name "soundSystem1". This helps resolve
 * any ambiguity when multiple beans of the same type exist.</p>
 *
 * @see Engine
 * @see Tire
 * @see SoundSystem
 * @see CarRepairType
 * @see CarRepairer
 * @see Qualifier
 */
@Data
@Component
public class CarBuilder {
    private final Engine engine;
    private final Tire tire;
    private final SoundSystem soundSystem;
    private CarRepairer carRepairer;
    private CarRepairType carRepairType;


    public CarBuilder(Engine engine, @Qualifier("fake tire") Tire tire, @Qualifier("soundSystem1") SoundSystem soundSystem, CarRepairer carRepairer) {
        this.engine = engine;
        this.tire = tire;
        this.soundSystem = soundSystem;
        this.carRepairer = carRepairer;
    }

    public void performCarRepair() {
        carRepairType.performRepair();
    }


}
