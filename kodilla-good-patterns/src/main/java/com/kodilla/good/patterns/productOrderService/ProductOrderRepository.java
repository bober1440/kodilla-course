package com.kodilla.good.patterns.productOrderService;

import java.util.List;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public void createPurchase(User user, List<Order> order) {
        System.out.println("Creating a new product order for user: " + user.toString());
    }
}
