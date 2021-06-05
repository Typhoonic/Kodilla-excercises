package com.kodilla.good.patterns.challenges.Allegro;

import java.time.Clock;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    private User user = new User("Kamil", "Dawid");
    private Product product = new Product("Elmex", 200);
    private Clock c1 = Clock.systemUTC();
    private LocalDateTime localDateTime = LocalDateTime.now(c1);

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
