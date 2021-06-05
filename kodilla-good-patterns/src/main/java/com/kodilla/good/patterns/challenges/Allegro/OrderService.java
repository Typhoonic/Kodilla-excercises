package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime when);

}
