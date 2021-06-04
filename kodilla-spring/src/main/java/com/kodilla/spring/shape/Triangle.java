package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

    @Override
    public String getShapeName() {
        System.out.println("This is a triangle");
        return "This is a triangle";
    }
}
