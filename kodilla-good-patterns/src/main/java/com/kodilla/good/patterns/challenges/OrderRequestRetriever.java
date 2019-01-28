package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Alex", "Newton");
        Item item = new Item("Computer_XTR529", "9745630DE");

        LocalDateTime timeOfOrder = LocalDateTime.of(2019, 9, 12, 20, 45);

        return new OrderRequest(user, item, timeOfOrder);
    }
}
