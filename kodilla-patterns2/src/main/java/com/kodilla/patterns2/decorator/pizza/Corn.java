package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Corn extends AbstractPizzaOrderDecorator{

    public Corn(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Corn";
    }
}
