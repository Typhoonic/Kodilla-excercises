package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user, LocalDateTime when, Product product);

}
