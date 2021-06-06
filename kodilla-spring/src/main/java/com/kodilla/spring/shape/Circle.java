package com.kodilla.spring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Circle implements Shape{
    @Override
    public String getShapeName() {
        System.out.println("This is a circle");
        return "This is a circle";
    }
}
