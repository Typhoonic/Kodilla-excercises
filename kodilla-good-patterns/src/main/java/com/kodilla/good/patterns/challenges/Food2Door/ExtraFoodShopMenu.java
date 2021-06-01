package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

public class ExtraFoodShopMenu implements Menu {

    @Override
    public HashMap<String, Integer> menu() {

        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Hamburger", 20);
        menu.put("Cheesburger", 30);
        menu.put("ChickenBurger", 15);

        return  menu;
    }
}
