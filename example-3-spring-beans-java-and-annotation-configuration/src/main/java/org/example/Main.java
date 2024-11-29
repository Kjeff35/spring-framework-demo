package org.example;

import org.example.config.AnnotationBasedConfiguration;
import org.example.config.JavaBasedAnnotationConfiguration;
import org.example.automobile.CarBuilder;
import org.example.services.CarRepairType;
import org.example.services.CarRepairer;
import org.example.services.impl.repairer.ProfessionalCarRepairer;
import org.example.services.impl.repairs.EngineRepair;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Create ApplicationContext with the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedAnnotationConfiguration.class, AnnotationBasedConfiguration.class);

        // Retrieve CarBuilder bean from context
        CarBuilder car = context.getBean(CarBuilder.class);

        // Retrieve EngineRepair bean from context
        CarRepairType engineRepair = context.getBean(EngineRepair.class);

        // Retrieve CarRepairer bean from context
        CarRepairer professionalCarRepairer = context.getBean(ProfessionalCarRepairer.class);

        // Set the CarRepairs
        car.setCarRepairType(engineRepair);

        // Set the carRepairer
        car.setCarRepairer(professionalCarRepairer);

        System.out.println(car);
        car.performCarRepair();

    }
}