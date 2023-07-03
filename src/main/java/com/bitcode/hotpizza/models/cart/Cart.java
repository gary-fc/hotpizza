package com.bitcode.hotpizza.models.cart;

import com.bitcode.hotpizza.models.ingredient.IngredientType;
import com.bitcode.hotpizza.models.pizza.PizzaType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Cart implements Serializable {
    private PizzaType pizzaType;
    private List<IngredientType> custom;
}
