package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShopMenu implements Menu {

    @Override
    public Map<String, Integer> menu() {

        Map<String, Integer> menu = new HashMap<>();
        menu.put("Hamburger", 20);
        menu.put("Cheesburger", 30);
        menu.put("ChickenBurger", 15);

        return menu;
    }
}
