package org.example.automobile.parts;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Tire {
    private String brand;
    private int size;

    public Tire(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
}
