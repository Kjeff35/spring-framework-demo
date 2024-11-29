package org.example.config;

import org.example.automobile.parts.Engine;
import org.example.automobile.parts.SoundSystem;
import org.example.automobile.parts.Tire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java-based configuration class for creating and configuring beans related to automobile parts.
 * This configuration class defines beans for different types of {@link Engine}, {@link SoundSystem}, and {@link Tire}.
 * It leverages the {@link Bean} and {@link Primary} annotations to declare beans in the Spring application context.
 *
 * <p>The {@code @Primary} annotation is used on one engine bean to specify it as the primary bean when multiple
 * beans of the same type exist. This is useful when you need to inject a specific bean by type, but there are multiple
 * implementations available.</p>
 */
@Configuration
public class JavaBasedAnnotationConfiguration {

    @Bean
    @Primary
    public Engine engine1() {
        Engine engine = new Engine();
        engine.setType("V8");

        Map<String, String> specifications = new HashMap<>();
        specifications.put("Horsepower", "450");
        specifications.put("Torque", "400Nm");
        specifications.put("FuelType", "Gasoline");

        engine.setSpecifications(specifications);
        return engine;
    }

    @Bean
    public Engine engine2() {
        Engine engine = new Engine();
        engine.setType("Electric");

        Map<String, String> specifications = new HashMap<>();
        specifications.put("Horsepower", "200");
        specifications.put("Torque", "300Nm");
        specifications.put("FuelType", "Electricity");
        specifications.put("BatteryCapacity", "75 kWh");

        engine.setSpecifications(specifications);
        return engine;
    }

    @Bean
    public SoundSystem soundSystem1() {
        SoundSystem soundSystem = new SoundSystem("Bose");

        List<String> audioModes = new ArrayList<>();
        audioModes.add("Surround");
        audioModes.add("Stereo");
        audioModes.add("Bass Boost");

        soundSystem.setAudioModes(audioModes);
        return soundSystem;
    }

    @Bean
    public SoundSystem soundSystem2() {
        SoundSystem soundSystem = new SoundSystem("JBL");

        List<String> audioModes = new ArrayList<>();
        audioModes.add("Soft");
        audioModes.add("Loud");
        audioModes.add("Bass Boost");

        soundSystem.setAudioModes(audioModes);
        return soundSystem;
    }

    @Bean(name = "fake tire")
    public Tire tire1() {
        return new Tire("Michelin", 18);
    }

    @Bean(name = "best tire")
    public Tire tire2() {
        return new Tire("Yokohama", 20);
    }

}
