package com.bitcode.hotpizza.models.pizza;

import com.bitcode.hotpizza.models.ingredient.IngredientType;

import java.util.List;

public interface PizzaFactory {
    Pizza createPizza(PizzaType pizzaType, List<IngredientType> ingredientType);
}
