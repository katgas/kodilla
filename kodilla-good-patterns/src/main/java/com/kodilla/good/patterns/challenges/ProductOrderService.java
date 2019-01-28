package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final Item item, final LocalDateTime timeOfOrder) {
        System.out.println("<< New item: " + item.getItem() + " has been ordered." +
                "\nTime of order: " + timeOfOrder.toString() +
                "\nOrder number: " + item.getOrderNumber() + " >>");
        return true;
    }
}
