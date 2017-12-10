package com.pswiech;

import java.math.BigDecimal;

public class MashroomDecorator implements PizzaDecorator {

    private Pizza pizza;

    MashroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getPrice() {
        return pizza.getPrice().add(new BigDecimal(6));
    }
}
