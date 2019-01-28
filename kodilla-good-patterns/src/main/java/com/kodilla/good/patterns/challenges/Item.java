package com.kodilla.good.patterns.challenges;

public class Item {
    private String item;
    private String orderNumber;

    public Item(final String item, final String orderNumber) {
        this.item = item;
        this.orderNumber = orderNumber;
    }

    public String getItem() {
        return item;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
}
