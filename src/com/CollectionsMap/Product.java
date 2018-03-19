package com.CollectionsMap;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class Product {

    public Product(String name, int weight, int id) {
        this.name = name;
        this.weight = weight;
        this.id = id;
    }

    private String name;
    private int weight;
    private int id;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", id='" + id + '\'' +
                '}';
    }

    public Product(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
