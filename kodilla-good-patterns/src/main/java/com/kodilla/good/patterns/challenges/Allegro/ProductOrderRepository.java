package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(User user, LocalDateTime when, Product product) {

        System.out.println("Utworzono bazę danych dla: " + user.getName() + "\nProdukt: "+ product.getName() + "\nDzień: " + when + "\nCena: " + product.getPrice());

        return true;
    }

}
