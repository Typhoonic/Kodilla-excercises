package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.ShopService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Aspect
public class OrderFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);
    private final ShopService shopService;

    @Autowired
    public OrderFacade(ShopService shopService) {
        this.shopService = shopService;
    }

    public void processOrder(final OrderDto orderDto, final Long userId) throws OrderProcessingException{
        boolean wasError = false;
        Long orderId = shopService.openOrder(userId);
        LOGGER.info("Registering new order, ID: " + orderId);
        if(orderId < 0){
            LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORISED);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORISED);
        }
        try{
            for(ItemDto orderItem: orderDto.getItems()){
                LOGGER.info("Adding item " + orderItem.getProductId() + ", " +orderItem.getQuantity() + " pcs");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQuantity());
            }
            BigDecimal orderValue = shopService.calculateValue(orderId);
            LOGGER.info("Value of order: " + orderValue + " USD");
            if(!shopService.doPayment(orderId)){
                LOGGER.error(OrderProcessingException.ERR_PAYMENT_REJECTED);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_PAYMENT_REJECTED);
            }
            LOGGER.info("Payment for order was done");
            if(!shopService.verifyOrder(orderId)){
                LOGGER.error(OrderProcessingException.ERR_VERIFICATION_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Order is ready to submit");
            if(!shopService.submitOrder(orderId)){
                LOGGER.error(OrderProcessingException.ERR_SUBMITTING_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_SUBMITTING_ERROR);
            }
            LOGGER.info("Order " + orderId + " submitted");
        }finally {
            if(wasError){
                LOGGER.info("Cancelling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }

    @Before("execution(* com.kodilla.patterns2.facade.ShopService.openOrder(..))")
    public void eventOpenOrder(){
        LOGGER.info("Trying to open order");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.addItem(..))")
    public void eventAddItem(){
        LOGGER.info("Item was added");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.removeItem(..))")
    public void eventRemoveItem(){
        LOGGER.info("Item was removed");
    }

    @Before("execution(* com.kodilla.patterns2.facade.ShopService.calculateValue(..))")
    public void eventCalculateValue(){
        LOGGER.info("Trying to calculate value");
    }

    @Before("execution(* com.kodilla.patterns2.facade.ShopService.doPayment(..))")
    public void eventDoPayment(){
        LOGGER.info("Need to make payment");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.verifyOrder(..))")
    public void eventVerifyOrder(){
        LOGGER.info("Order was verified");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.submitOrder(..))")
    public void eventSubmitOrder(){
        LOGGER.info("Try to submit order");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.ShopService.cancelOrder(..))")
    public void eventCancelOrder(){
        LOGGER.info("Order was cancelled");
    }
}
