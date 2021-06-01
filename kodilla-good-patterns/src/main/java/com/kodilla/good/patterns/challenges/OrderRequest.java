package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest implements OrderService{

    private User user;
    private LocalDateTime when;

    @Override
    public boolean order(User user, LocalDateTime when) {
        this.user = user;
        this.when = when;

        return true;
    }
}
