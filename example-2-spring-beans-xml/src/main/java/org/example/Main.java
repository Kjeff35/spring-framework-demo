package org.example;

import org.example.automobile.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Car car1 = (Car) context.getBean("car");
        Car car2 = (Car) context.getBean("car");
        car1.setMake("Bugatti");
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
    }
}