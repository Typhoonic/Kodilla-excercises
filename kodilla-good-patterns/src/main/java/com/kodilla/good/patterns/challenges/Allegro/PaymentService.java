package com.kodilla.good.patterns.challenges;

public class PaymentService implements OrderPayment{

    @Override
    public PaymentDto makePaymentOfBlik(User user, double price) {
        System.out.println("Udało się zrealizować transakcje!");

        return new PaymentDto(price, true);
    }
}
