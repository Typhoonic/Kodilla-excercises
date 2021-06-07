package com.kodilla.good.patterns.challenges.Allegro;

import com.kodilla.good.patterns.challenges.MailService;
import com.kodilla.good.patterns.challenges.OrderProcessor;
import com.kodilla.good.patterns.challenges.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.PaymentService;
import com.kodilla.good.patterns.challenges.ProductOrderRepository;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderRepository(), new com.kodilla.good.patterns.challenges.OrderRequest(), new PaymentService());
        orderProcessor.process(orderRequestRetriever.getUser(), orderRequestRetriever.getLocalDateTime(), orderRequestRetriever.getProduct());

}}
