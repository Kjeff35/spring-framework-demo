package org.example.automobile.services;

import lombok.Data;
import org.example.automobile.parts.Engine;
import org.example.automobile.parts.SoundSystem;
import org.example.automobile.parts.Tire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Data
@Service
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

    public void setCarRepairType(CarRepairType carRepairType) {
        this.carRepairType = carRepairType;
    }

    public void performCarRepair() {
        carRepairType.performRepair();
    }



}
