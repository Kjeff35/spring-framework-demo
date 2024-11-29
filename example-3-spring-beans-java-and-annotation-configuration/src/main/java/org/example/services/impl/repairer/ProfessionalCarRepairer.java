package org.example.services.impl.repairer;

import lombok.ToString;
import org.example.services.CarRepairer;
import org.springframework.stereotype.Service;

/**
 * Represents a professional car repairer.
 * <p>
 * This class implements the {@link CarRepairer} interface and provides a more advanced implementation of car repairs
 * for a professional repairer. It prints a message indicating the repairer type.
 * </p>
 */
@Service
@ToString
public class ProfessionalCarRepairer implements CarRepairer {
    public void myRepairer() {
        System.out.println("Professional Car Repairer");
    }
}
