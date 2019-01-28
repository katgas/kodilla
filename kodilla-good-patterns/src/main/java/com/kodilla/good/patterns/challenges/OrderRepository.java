package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, Item item, LocalDateTime timeOfOrder);
}
