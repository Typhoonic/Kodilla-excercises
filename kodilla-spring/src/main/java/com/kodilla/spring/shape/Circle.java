package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    @Override
    public String getShapeName() {
        System.out.println("This is a circle");
        return "This is a circle";
    }
}
