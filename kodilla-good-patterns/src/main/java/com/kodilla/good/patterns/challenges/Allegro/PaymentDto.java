package com.kodilla.good.patterns.challenges.Allegro;

public class PaymentDto {

    private double price;
    private boolean isPayed;

    public PaymentDto(double price, boolean isPayed) {
        this.price = price;
        this.isPayed = isPayed;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPayed() {
        return isPayed;
    }
}
