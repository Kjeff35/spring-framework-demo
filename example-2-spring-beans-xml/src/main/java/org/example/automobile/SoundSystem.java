package org.example.automobile;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SoundSystem {
    private String brand;
    private List<String> audioModes;

    public SoundSystem(String brand) {
        this.brand = brand;
    }
}
