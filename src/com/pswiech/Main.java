package com.pswiech;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new CheeseDecorator(new MashroomDecorator(new Napoli()));
        System.out.println(pizza.getPrice());
    }
}
