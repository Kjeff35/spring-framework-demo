package org.example.automobile;

import lombok.Data;
import org.example.automobile.parts.Engine;
import org.example.automobile.parts.SoundSystem;
import org.example.automobile.parts.Tire;

import java.util.Set;

@Data
public class Car {
    private String make;
    private String model;
    private int year;
    private Engine engine;
    private Tire tire;
    private SoundSystem soundSystem;
    private Set<String> features;

    public Car(Tire tire, SoundSystem soundSystem) {
        this.tire = tire;
        this.soundSystem = soundSystem;
    }

}
