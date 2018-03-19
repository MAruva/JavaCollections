package com.CollectionSet;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class Product {

    private String name;
    private int weight;

    public static final Comparator<Product> BY_WEIGHT = Comparator.comparing(Product::getWeight);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        return result;

        // can return this for more readability -> since Java 7 ->  Objects.hash(name,weight);
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


    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
