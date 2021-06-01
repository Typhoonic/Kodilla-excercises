package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class CompanyTemplate {

    public void makeTemplate(String name, String address, String number, HashMap<String, Integer> menu){

        System.out.println("Hi!" + "\nWe are " + name + " ;)" + "\nOur address is: " + address + "." + "\nWith some questions please call to: " + number + ".");
        System.out.println("Our menu is: ");
        for (Map.Entry ex : menu.entrySet()){

            System.out.println("Product: " + ex.getKey() + " Summary: " + ex.getValue());

        }


    }

}
