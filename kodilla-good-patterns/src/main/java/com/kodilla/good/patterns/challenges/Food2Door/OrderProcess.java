package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcess {

    private InformationService informationService;
    private CompanyService companyService;

    public OrderProcess(InformationService informationService, CompanyService companyService) {
        this.informationService = informationService;
        this.companyService = companyService;
    }

    public void makeOrder(final User user){

        boolean isTrue = companyService.process();

        if(isTrue){

            informationService.inform(user);

        }else{

            System.out.println("Sorry, something gone wrong.");

        }
    }
}
