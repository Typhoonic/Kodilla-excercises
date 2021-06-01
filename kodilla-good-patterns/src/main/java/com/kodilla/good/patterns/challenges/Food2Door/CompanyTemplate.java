package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class CompanyTemplate {

    public void makeTemplate(String name, String address, String number, Map<String, Integer> menu){

        System.out.println("Hi!" + "\nWe are " + name + " ;)" + "\nOur address is: " + address + "." + "\nWith some questions please call to: " + number + ".");
        System.out.println("Our menu is: ");
        for (Map.Entry menuOfCompany : menu.entrySet()){

            System.out.println("Product: " + menuOfCompany.getKey() + " Summary: " + menuOfCompany.getValue());

        }

    }

}
