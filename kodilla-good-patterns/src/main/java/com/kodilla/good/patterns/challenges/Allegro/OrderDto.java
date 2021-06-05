package com.kodilla.good.patterns.challenges.Allegro;

public class OrderDto {

    private User user;
    private boolean isOrder;

    public OrderDto(User user, boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;

    }

    public User getUser() {
        return user;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
