package org.example.automobile;

import lombok.Data;

@Data
public class Tire {
    private String brand;
    private int size;

    public Tire(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
}
