package com.kodilla.good.patterns.food2door;

public class DeliverProcessor {

    public static final String HEALTHY_FOOD_SHOP = "HEALTHY_FOOD_SHOP";
    public static final String GLUTEN_FREE_SHOP = "GLUTEN_FREE_SHOP";
    public static final String EXTRA_FOOD_SHOP = "EXTRA_FOOD_SHOP";

    public static Deliver getDeliver(String shopName) {
        if(shopName.equals(HEALTHY_FOOD_SHOP))
            return new HealthyFoodShop();
        else if(shopName.equals(GLUTEN_FREE_SHOP))
            return new GlutenFreeShop();
        else if(shopName.equals(EXTRA_FOOD_SHOP))
            return new ExtraFoodShop();
        else
            throw new IllegalArgumentException("Unknown shop: " + shopName);
    }
}
