package com.bitcode.hotpizza.models.pizza;

public class PizzaAmerican implements Pizza{

    @Override
    public String getDescription() {
        return "Pizza american";
    }

    @Override
    public double getCost() {
        return 25;
    }
}
