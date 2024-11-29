package org.example.automobile.services.impl.repairer;

import lombok.ToString;
import org.example.automobile.services.CarRepairer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@ToString
public class AmateurCarRepairer implements CarRepairer {
    public void myRepairer() {
        System.out.println("Amateur Car Repairer");
    }
}
