package com.kodilla.good.patterns.productOrderService;

import java.util.List;

public class ProductOrderService implements OrderService{
    @Override
    public boolean possibilities(User user, List<Order> orders) {
        System.out.println("We are checking possibilities: " + orders.toString() + " for " + user.toString());
        return true;
    }
}
