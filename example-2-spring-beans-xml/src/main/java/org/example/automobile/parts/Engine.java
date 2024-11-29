package org.example.automobile.parts;

import lombok.Data;

import java.util.Map;

@Data
public class Engine {
    private String type;
    private Map<String, String> specifications;
}
