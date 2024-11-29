package org.example;

import org.example.beans.JavaBean;
import org.example.pojo.Pojo;

public class Main {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        JavaBean javaBean = new JavaBean();

        System.out.println(pojo);
        System.out.println(javaBean);
    }
}