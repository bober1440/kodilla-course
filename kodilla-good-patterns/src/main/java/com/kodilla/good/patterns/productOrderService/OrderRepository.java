package com.kodilla.good.patterns.productOrderService;

import java.util.List;

public interface OrderRepository {

    void createPurchase (User user, List<Order> order);
}
