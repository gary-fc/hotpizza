package com.bitcode.hotpizza.models.order;

import com.bitcode.hotpizza.models.delivery.DeliveryStrategy;
import com.bitcode.hotpizza.models.pizza.Pizza;

import java.util.List;

public class Order {
    private List<Pizza> pizzaList;
    private DeliveryStrategy deliveryStrategy;
    private double productCost;

    public double getProductCost() {
        pizzaList.forEach(pizza -> {
            this.productCost = this.productCost + pizza.getCost();
        });

        return productCost;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
}
