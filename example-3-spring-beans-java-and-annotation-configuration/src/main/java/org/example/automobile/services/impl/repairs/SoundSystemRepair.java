package org.example.automobile.services.impl.repairs;

import lombok.ToString;
import org.example.automobile.services.CarRepairType;
import org.springframework.stereotype.Service;

@Service
@ToString
public class SoundSystemRepair implements CarRepairType {

    public void performRepair() {
        System.out.println("Performing sound system repair...");
    }
}
