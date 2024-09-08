package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class HealthyFoodShop implements Deliver{
    @Override
    public boolean process(Order order) {
        System.out.println("Welcome to the Healthy Food Shop!");
        System.out.println("Your order has been delivered! : " + order.getProduct() + ", " + order.getQuantity());
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
