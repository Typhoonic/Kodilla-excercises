package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {


    public static void main(String[] args) {

        RequestRetriever requestRetriever = new RequestRetriever();
        OrderProcess orderProcess = new OrderProcess(new MailService(), new ExtraFoodShop());
        orderProcess.makeOrder(requestRetriever.getUser());

    }

}
