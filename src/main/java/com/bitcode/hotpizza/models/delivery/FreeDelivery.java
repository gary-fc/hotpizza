package com.bitcode.hotpizza.models.delivery;

import java.io.Serializable;

public class FreeDelivery implements DeliveryStrategy, Serializable {
    private static final long serialVersionUID = 1L;
    private final double cost = 0;

    @Override
    public double calculateDeliveryCost() {
        return cost;
    }

    public double getCost() {
        return cost;
    }

}
