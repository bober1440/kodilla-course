package com.kodilla.good.patterns.productOrderService;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User ("John", "Doe");
        Order order1 = new Order ("Wine", 3);
        Order order2 = new Order ("Beer", 4);

        return new OrderRequest (user, order1, order2);
    }
}
