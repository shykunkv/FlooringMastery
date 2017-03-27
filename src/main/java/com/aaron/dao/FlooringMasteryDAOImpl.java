package com.aaron.dao;

import com.aaron.model.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlooringMasteryDAOImpl implements FlooringMasteryDAO {

    private final static List<Order> orders = new ArrayList<>();

    static {
        orders.add(new Order(0L, "orderNameOne"));
        orders.add(new Order(1L, "orderNameTwo"));
        orders.add(new Order(2L, "orderNameThree"));
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
