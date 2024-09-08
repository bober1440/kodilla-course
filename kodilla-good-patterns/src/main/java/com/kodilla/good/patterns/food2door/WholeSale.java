package com.kodilla.good.patterns.food2door;

public class WholeSale {

    public boolean processOrder(Order order) {
        Deliver deliver = DeliverProcessor.getDeliver(order.getShopName());
        return deliver.process(order);
    }
}
