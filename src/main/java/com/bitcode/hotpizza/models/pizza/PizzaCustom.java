package com.bitcode.hotpizza.models.pizza;

public class PizzaCustom implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza basic";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
