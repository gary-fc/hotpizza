package com.bitcode.hotpizza.models.pizza;

public class PizzaFactoryImpl implements PizzaFactory {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;

        switch (pizzaType) {
            case AMERICAN -> pizza = new PizzaAmerican();
            case NEAPOLITAN -> pizza = new PizzaNeapolitan();
            case FOUR_CHEESES -> pizza = new PizzaFourCheeses();
            default -> throw new IllegalArgumentException("Tipo de pizza desconocido: " + pizzaType);
        }

        return pizza;
    }
}
