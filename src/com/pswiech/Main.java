package com.pswiech;


// lepszy przyklad: salon samochodowy

// https://en.wikipedia.org/wiki/Decorator_pattern
// Dynamically adds responsibility to the interface by wrapping the original code


public class Main {

    public static void main(String[] args) {

        Pizza pizza = new CheeseDecorator(new MashroomDecorator(new Napoli()));
        System.out.println(pizza.getPrice());
    }
}
