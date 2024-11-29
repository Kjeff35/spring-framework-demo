package org.example.services.impl.repairer;

import lombok.ToString;
import org.example.services.CarRepairer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Represents an amateur car repairer.
 * <p>
 * This class implements the {@link CarRepairer} interface and provides a simple implementation of car repairs
 * for an amateur repairer. It prints a message indicating the repairer type.
 * </p>
 */
@Service
@Primary
@ToString
public class AmateurCarRepairer implements CarRepairer {
    public void myRepairer() {
        System.out.println("Amateur Car Repairer");
    }
}
