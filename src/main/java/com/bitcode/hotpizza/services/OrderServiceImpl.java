package com.bitcode.hotpizza.services;

import com.bitcode.hotpizza.models.cart.Cart;
import com.bitcode.hotpizza.models.delivery.DeliveryStrategy;
import com.bitcode.hotpizza.models.delivery.FreeDelivery;
import com.bitcode.hotpizza.models.delivery.NormalDelivery;
import com.bitcode.hotpizza.models.ingredient.IngredientType;
import com.bitcode.hotpizza.models.order.Order;
import com.bitcode.hotpizza.models.pizza.Pizza;
import com.bitcode.hotpizza.models.pizza.PizzaFactory;
import com.bitcode.hotpizza.models.pizza.PizzaFactoryImpl;
import com.bitcode.hotpizza.models.pizza.PizzaType;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Service
public class OrderServiceImpl implements OrderService {
    private final List<String> promotionTwoForOne = new ArrayList<>(Arrays.asList("martes", "miercoles", "domingo"));
    private final List<String> deliveryFree = new ArrayList<>(Arrays.asList("domingo"));

    @Override
    public Order createOrder(Cart cart) {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        Order order = new Order();
        List<Pizza> pizzaList = new ArrayList<>();
        DeliveryStrategy deliveryStrategy;
        PizzaFactory pizzaFactory = new PizzaFactoryImpl();

        pizzaList.add(pizzaFactory.createPizza(cart.getPizzaType(), cart.getCustom()));
        if (promotionTwoForOne.contains(dayName)) {
            pizzaList.add(pizzaFactory.createPizza(cart.getPizzaType(), cart.getCustom()));
        }

        if (deliveryFree.contains(dayName)) {
            deliveryStrategy = new FreeDelivery();
        } else {
            deliveryStrategy = new NormalDelivery();
        }

        order.setPizzaList(pizzaList);
        order.setDeliveryStrategy(deliveryStrategy);

        return order;
    }
}
