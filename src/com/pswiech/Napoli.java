package com.pswiech;

import java.math.BigDecimal;

public class Napoli implements Pizza {

    private BigDecimal price;

    Napoli() {
        this.price = new BigDecimal(20);
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

}
