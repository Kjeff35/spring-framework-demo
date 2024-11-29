package org.example;

import org.example.automobile.services.CarBuilder;
import org.example.automobile.services.CarRepairType;
import org.example.automobile.services.CarRepairer;
import org.example.automobile.services.impl.repairer.AmateurCarRepairer;
import org.example.automobile.services.impl.repairer.ProfessionalCarRepairer;
import org.example.automobile.services.impl.repairs.EngineRepair;
import org.example.automobile.services.impl.repairs.TireRepair;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Create ApplicationContext with the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(org.example.automobile.AutomobileConfig.class);

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