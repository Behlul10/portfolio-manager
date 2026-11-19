package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
    String name;
    String owner;
    ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double totalVal = 0;
        for (Valuable item : assets) {
            totalVal += item.getValue();
        }
        return totalVal;
    }

    public Valuable getMostValuable() {
        Valuable leastValued = assets.get(0);
        for (int i = 0; i < assets.size(); i++) {
            if(assets.get(i).getValue() > leastValued.getValue()) {
                leastValued = assets.get(i);
            }
        }
        return leastValued;
    }

    public Valuable getLeasValuable() {
        Valuable leastValued = assets.get(0);
        for (int i = 0; i < assets.size(); i++) {
            if(assets.get(i).getValue() < leastValued.getValue()) {
                leastValued = assets.get(i);
            }
        }
        return leastValued;
    }



}
