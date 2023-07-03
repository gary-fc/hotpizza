package com.bitcode.hotpizza.services;

import com.bitcode.hotpizza.models.cart.Cart;
import com.bitcode.hotpizza.models.order.Order;
import org.springframework.stereotype.Component;

@Component
public interface OrderService {
    Order createOrder(Cart cart);
}
