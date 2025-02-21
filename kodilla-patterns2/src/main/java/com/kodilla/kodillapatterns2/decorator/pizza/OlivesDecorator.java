package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivesDecorator extends AbstractPizzaOrderDecorator {
    public OlivesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + olives";
    }
}
