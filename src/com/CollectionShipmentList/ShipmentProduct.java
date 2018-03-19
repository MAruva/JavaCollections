package com.CollectionShipmentList;

import java.util.Comparator;

/**
 * Created by Mallika Aruva on 2/15/2018.
 */
public class ShipmentProduct {
    private String name;
    private int weight;

    public static final Comparator<ShipmentProduct> BY_WEIGHT = Comparator.comparing(ShipmentProduct::getWeight);

    public ShipmentProduct(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ShipmentProduct{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
