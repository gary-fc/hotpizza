package com.bitcode.hotpizza.models.pizza;

public interface PizzaFactory {
    Pizza createPizza(PizzaType pizzaType);
}
