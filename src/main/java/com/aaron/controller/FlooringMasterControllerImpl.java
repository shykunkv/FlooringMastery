package com.aaron.controller;

import com.aaron.service.FlooringMasteryService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;

@Controller
public class FlooringMasterControllerImpl implements FlooringMasterController {

    private final FlooringMasteryService flooringMasteryService;

    @Inject
    public FlooringMasterControllerImpl(final FlooringMasteryService flooringMasteryService) {
        this.flooringMasteryService = flooringMasteryService;
    }

    @Override
    public void printAllOrders() {
        flooringMasteryService.printAllOrders();
    }
}
