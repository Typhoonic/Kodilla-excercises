package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FourTypesOfCheese extends AbstractPizzaOrderDecorator{

    public FourTypesOfCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Four types of cheese";
    }
}
