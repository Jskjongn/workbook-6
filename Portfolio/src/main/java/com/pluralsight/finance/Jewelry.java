package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double karat) {
        super(name, karat * 1000);
        this.karat = karat;
    }

    // abstract interface method
    @Override
    public double getValue() {
        return getMarketValue();
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
}
