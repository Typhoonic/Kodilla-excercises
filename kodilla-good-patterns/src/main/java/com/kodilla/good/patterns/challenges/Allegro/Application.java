package com.kodilla.good.patterns.challenges.Allegro;


public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderRepository(), new OrderRequest(), new PaymentService());
        orderProcessor.process(orderRequestRetriever.getUser(), orderRequestRetriever.getLocalDateTime(), orderRequestRetriever.getProduct());

}}
