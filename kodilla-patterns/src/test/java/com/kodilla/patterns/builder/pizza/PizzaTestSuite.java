package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testPizzaNew(){

        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredients("Onion")
                .sauce("Spicy")
                .bottom("Thin")
                .ingredients("Ham")
                .ingredients("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);

    }

}
