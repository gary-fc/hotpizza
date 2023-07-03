package com.bitcode.hotpizza.models.pizza;

import com.bitcode.hotpizza.models.ingredient.IngredientType;

import java.util.List;

public class PizzaFactoryImpl implements PizzaFactory {
    @Override
    public Pizza createPizza(PizzaType pizzaType, List<IngredientType> ingredientType) {
        Pizza pizza;

        switch (pizzaType) {
            case AMERICAN -> pizza = new PizzaAmerican();
            case NEAPOLITAN -> pizza = new PizzaNeapolitan();
            case FOUR_CHEESES -> pizza = new PizzaFourCheeses();
            case CUSTOM -> pizza = new PizzaCustom();
            default -> throw new IllegalArgumentException("Tipo de pizza desconocido: " + pizzaType);
        }

        for (IngredientType ingredient : ingredientType) {
            if (ingredient == IngredientType.CHEESE) {
                pizza = new CheeseDecorator(pizza);
            }

            if (ingredient == IngredientType.TOMATO) {
                pizza = new TomatoDecorator(pizza);
            }
        }

        return pizza;
    }
}
