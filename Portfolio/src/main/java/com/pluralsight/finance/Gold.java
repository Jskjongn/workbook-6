package com.pluralsight.finance;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(double weight) {
        super("Gold", weight * 3000);
        this.weight = weight;
    }

    // abstract interface method
    @Override
    public double getValue() {
        return getMarketValue();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
