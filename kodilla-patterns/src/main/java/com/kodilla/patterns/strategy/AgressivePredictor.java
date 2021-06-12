package com.kodilla.patterns.strategy;

public class AgressivePredictor implements BuyPredictor{

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }

}
