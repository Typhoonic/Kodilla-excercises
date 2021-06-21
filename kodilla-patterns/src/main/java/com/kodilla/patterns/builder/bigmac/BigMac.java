package com.kodilla.patterns.builder.bigmac;

import java.util.*;

public class BigMac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigMacBuilder{

        private String bun;
        private int burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String typeOfBun){

            switch (typeOfBun){
                case Bun.SESAME:
                    this.bun = Bun.SESAME;
                    return this;
                case Bun.ROLL:
                    this.bun = Bun.ROLL;
                    return this;
                default:
                    throw new IllegalStateException("A bun can be with SESAME or same ROLL!");
            }
        }

        public BigMacBuilder burgers(int lotOfBurgers){
            this.burgers = lotOfBurgers;
            return this;
        }

        public BigMacBuilder sauce(String typeOfSauce){

            switch (typeOfSauce){
                case Sauce.STANDARD:
                    this.sauce = Sauce.STANDARD;
                    return this;
                case Sauce.THOUSANDISLANDS:
                    this.sauce = Sauce.THOUSANDISLANDS;
                    return this;
                case Sauce.BARBECUE:
                    this.sauce = Sauce.BARBECUE;
                    return this;
                default:
                    throw new IllegalStateException("A sauce can be STANDARD, THOUSANDISLANDS or BARBECUE!");
            }
        }

        public BigMacBuilder ingredients(String ingredient){

            switch (ingredient){
                case Ingredients.BACON:
                    ingredients.add(Ingredients.BACON);
                    return this;
                case Ingredients.CHEESE:
                    ingredients.add(Ingredients.CHEESE);
                    return this;
                case Ingredients.CHILLI:
                    ingredients.add(Ingredients.CHILLI);
                    return this;
                case Ingredients.CUCUMBER:
                    ingredients.add(Ingredients.CUCUMBER);
                    return this;
                case Ingredients.LETTUCE:
                    ingredients.add(Ingredients.LETTUCE);
                    return this;
                case Ingredients.MUSHROOMS:
                    ingredients.add(Ingredients.MUSHROOMS);
                    return this;
                case Ingredients.ONION:
                    ingredients.add(Ingredients.ONION);
                    return this;
                case Ingredients.PRAWNS:
                    ingredients.add(Ingredients.PRAWNS);
                    return this;
                default:
                    throw new IllegalStateException("A ingredients what you can choose are: BACON, CHEESE, CHILLI, CUCUMBER, LETTUCE, MUSHROOMS, ONION or PRAWNS");
            }

        }

        public BigMac build(){
            return new BigMac(bun,burgers,sauce,ingredients);
        }

    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Your BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
