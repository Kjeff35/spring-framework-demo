package org.example.automobile.parts;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class Engine {
    private String type;
    private Map<String, String> specifications;
}
