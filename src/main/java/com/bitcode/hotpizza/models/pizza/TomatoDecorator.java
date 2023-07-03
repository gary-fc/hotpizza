package com.bitcode.hotpizza.models.pizza;

public class TomatoDecorator  implements PizzaDecorator {
    private Pizza pizza;
    private final String ingredientName = "Tomato";
    private final double ingredientCost = 3.00;

    public TomatoDecorator(Pizza pizza) {
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
