package com.aaron.service;


import com.aaron.dao.FlooringMasteryDAO;
import com.aaron.model.Order;
import com.aaron.view.FlooringMasteryView;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class FlooringMasteryServiceProdImpl implements FlooringMasteryService {

    private final FlooringMasteryDAO dao;
    private final FlooringMasteryView view;

    @Inject
    public FlooringMasteryServiceProdImpl(final FlooringMasteryDAO dao, final FlooringMasteryView view) {
        this.dao = dao;
        this.view = view;
    }

    public void printAllOrders() {
        List<Order> allOrders = dao.getAllOrders();
        allOrders.forEach(view::printOrder);
    }
}
