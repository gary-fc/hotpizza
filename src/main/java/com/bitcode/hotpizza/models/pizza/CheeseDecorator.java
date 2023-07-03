package com.bitcode.hotpizza.models.pizza;

public class CheeseDecorator implements PizzaDecorator {
    private Pizza pizza;
    private final String ingredientName = "Cheese";
    private final double ingredientCost = 2.00;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", this.pizza.getDescription(), this.ingredientName);
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + this.ingredientCost;
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
