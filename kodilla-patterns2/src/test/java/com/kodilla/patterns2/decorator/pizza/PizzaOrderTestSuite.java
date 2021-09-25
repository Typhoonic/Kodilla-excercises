package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithDecoratorGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FourTypesOfCheese(thePizza);
        thePizza = new Corn(thePizza);
        thePizza = new Ham(thePizza);
        thePizza = new Mushrooms(thePizza);
        thePizza = new Onion(thePizza);
        //When
        String description = thePizza.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Ingredients: Cake, Cheese, Tomato Dip, Four types of cheese, Corn, Ham, Mushrooms, Onion", description);
    }

    @Test
    public void testPizzaOrderWithDecoratorGetCost(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new FourTypesOfCheese(thePizza);
        thePizza = new Corn(thePizza);
        thePizza = new Ham(thePizza);
        thePizza = new Mushrooms(thePizza);
        thePizza = new Onion(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        System.out.println("Cost your pizza: " + theCost);
        //Then
        assertEquals(new BigDecimal(46.00), theCost);
    }
}
