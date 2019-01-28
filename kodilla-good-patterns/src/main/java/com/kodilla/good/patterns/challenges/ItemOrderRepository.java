package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderRepository implements OrderRepository {

    public boolean createOrder(User user, Item item, LocalDateTime timeOfOrder) {
        return true;
    }
}
