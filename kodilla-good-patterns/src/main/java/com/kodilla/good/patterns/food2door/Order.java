package com.kodilla.good.patterns.food2door;

public class Order {

    private String shopName;
    private String product;
    private int quantity;

    public Order(String shopName, String product, int quantity) {
        this.shopName = shopName;
        this.product = product;
        this.quantity = quantity;
    }

    public String getShopName() {
        return shopName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
