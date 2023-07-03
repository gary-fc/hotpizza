package com.bitcode.hotpizza.models.delivery;

public class FreeDelivery implements DeliveryStrategy{
    @Override
    public double calculateDeliveryCost() {
        return 0;
    }
}
