package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Item item;
    private LocalDateTime timeOfOrder;

    public OrderRequest(final User user, final Item item, final LocalDateTime timeOfOrder) {
        this.user = user;
        this.item = item;
        this.timeOfOrder = timeOfOrder;
    }
    public User getUser() {
        return user;
    }
    public Item getItem() {
        return item;
    }
    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }
    
}
