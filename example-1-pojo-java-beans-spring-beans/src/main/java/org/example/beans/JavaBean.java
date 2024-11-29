package org.example.beans;

import java.io.Serializable;

// Enterprise Java Beans
public class JavaBean implements Serializable { // 3. Implements serializable

    private String name;
    private int age;

    // 1. No-arg constructor
    public JavaBean() {

    }

    // 2. Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
