package com.kodilla.good.patterns.productOrderService;

public class OrderDto {

    private User user;
    private boolean possibilities;

    public OrderDto(User user, boolean possibilities) {
        this.user = user;
        this.possibilities = possibilities;
    }

    public User getUser() {
        return user;
    }

    public boolean isPossibilities() {
        return possibilities;
    }
}
