package com.kodilla.good.patterns.food2door;

public class ApplicationRunner {
    public static void main(String[] args) {

        Order order = new Order(DeliverProcessor.GLUTEN_FREE_SHOP, "Wine", 10);
        Order order1 = new Order(DeliverProcessor.HEALTHY_FOOD_SHOP, "Bread", 10);
        Order order2 = new Order(DeliverProcessor.EXTRA_FOOD_SHOP, "Chicken", 5);


        WholeSale wholeSale = new WholeSale();

        System.out.println(wholeSale.processOrder(order));
        System.out.println(wholeSale.processOrder(order1));
        System.out.println(wholeSale.processOrder(order2));

    }
}
