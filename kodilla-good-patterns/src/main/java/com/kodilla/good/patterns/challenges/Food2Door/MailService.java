package com.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements InformationService{

    @Override
    public void inform(User user) {

        System.out.println("Dear " + user.getName() + "! Your order was end, we hope that all were going good.");

    }
}
