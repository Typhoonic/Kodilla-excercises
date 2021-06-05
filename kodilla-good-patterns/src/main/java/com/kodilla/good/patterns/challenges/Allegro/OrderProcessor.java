package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;
    private OrderPayment orderPayment;

    public OrderProcessor(InformationService informationService, OrderRepository orderRepository, OrderService orderService, OrderPayment orderPayment) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
        this.orderPayment = orderPayment;
    }

    public OrderDto process(final User user, final LocalDateTime when, final Product product){

        if(orderService.order(user, when) && orderPayment.makePaymentOfBlik(user, product.getPrice()).isPayed()){
            informationService.inform(user);
            orderRepository.createOrder(user, when,product);
            return new OrderDto(user, true);
        }else{
            return new OrderDto(user, false);
        }

    }
}
