package com.bitcode.hotpizza.controllers;

import com.bitcode.hotpizza.models.cart.Cart;
import com.bitcode.hotpizza.models.order.Order;
import com.bitcode.hotpizza.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/createOrder",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Order> createOrder(@RequestBody Cart cart) {
        return new ResponseEntity<>(orderService.createOrder(cart), HttpStatus.CREATED);
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }
}
