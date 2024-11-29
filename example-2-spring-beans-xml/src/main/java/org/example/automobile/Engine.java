package org.example.automobile;

import lombok.Data;

import java.util.Map;

@Data
public class Engine {
    private String type;
    private Map<String, String> specifications;
}
