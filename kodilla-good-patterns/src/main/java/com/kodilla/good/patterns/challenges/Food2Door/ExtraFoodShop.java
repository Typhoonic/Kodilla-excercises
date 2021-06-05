package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class ExtraFoodShop implements CompanyService{

    public boolean process() {

        Map<String, Integer> menu = new ExtraFoodShopMenu().menu();
        CompanyTemplate companyTemplate = new CompanyTemplate();
        companyTemplate.makeTemplate("ExtraFoodShop", "Kraków, Al.Piłsudzkiego 12", "+48 691 658 652", menu);
        return true;

    }

}
