package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(User user, LocalDateTime when, PaymentService payment) {

        System.out.println("Utworzono bazę danych dla: " + user.getName() + " Dnia: " + when + " Cena: " + payment.makePaymentOfBlik(user, 200).getPrice());

        return true;


    }

}
