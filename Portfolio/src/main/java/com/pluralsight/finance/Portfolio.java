package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    // ------------------------------------------------------------------------

    // derived method
    public void add(Valuable asset) {
        assets.add(asset);
    }

    // ------------------------------------------------------------------------

    // derived getters
    public double getValue() {

        // declaring net value
        double netValue = 0;
        // for each asset in assets it gets the value and adds it to the total net value
        for (Valuable asset : assets) {
            netValue += asset.getValue();
        }

        return netValue;
    }

    public Valuable getMostValuable() {

        // goes through the assets list and compares to find the most valuable asset
        return Collections.max(assets, Comparator.comparingDouble(Valuable :: getValue));
    }

    public Valuable getLeastValuable() {

        // goes through the assets list and compares to find the least valuable asset
        return Collections.min(assets, Comparator.comparingDouble(Valuable :: getValue));
    }

    // ------------------------------------------------------------------------

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
