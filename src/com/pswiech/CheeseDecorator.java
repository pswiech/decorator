package com.pswiech;

import java.math.BigDecimal;

public class CheeseDecorator implements PizzaDecorator {

    private Pizza pizza;

    CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getPrice() {
        return pizza.getPrice().add(new BigDecimal(7));
    }
}
