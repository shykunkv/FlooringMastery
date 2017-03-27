package com.aaron;


import com.aaron.config.FlooringMasteryConfiguration;
import com.aaron.controller.FlooringMasterController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FlooringMasteryConfiguration.class);

        FlooringMasterController controller = context.getBean(FlooringMasterController.class);
        controller.printAllOrders();
    }
}
