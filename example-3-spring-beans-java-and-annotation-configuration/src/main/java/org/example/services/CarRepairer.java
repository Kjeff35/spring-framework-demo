package org.example.services;

/**
 * Represents a car repairer who can perform car repairs.
 * <p>
 * This interface defines the method {@link #myRepairer()} that all car repairers should implement.
 * Each implementation will provide specific functionality based on the type of car repairer (e.g., amateur or professional).
 * </p>
 */
public interface CarRepairer {
    void myRepairer();
}
