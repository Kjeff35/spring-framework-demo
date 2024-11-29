package org.example.services;

/**
 * Represents a type of car repair that can be performed on different components of a car.
 * <p>
 * Implementations of this interface define the specific repair logic for each car component,
 * such as the engine, sound system, or tire.
 * </p>
 */
public interface CarRepairType {
    void performRepair();
}
