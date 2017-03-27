package com.aaron.view;

import com.aaron.model.Order;
import org.springframework.stereotype.Component;

@Component
public class FlooringMasteryViewConsoleImpl implements FlooringMasteryView {

    public void printOrder(Order order) {
        System.out.println(order.toString());
    }
}
