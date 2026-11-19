package com.pluralsight;

public abstract class Asset implements Valuable {
    String name;
    double marketValue;

    public Asset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public double getValue() {
        return this.marketValue;
    }
}
