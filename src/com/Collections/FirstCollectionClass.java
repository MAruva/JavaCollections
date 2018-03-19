package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Mallika Aruva on 2/15/2018.
 */
public class FirstCollectionClass {

    public static void main(String[] args) {


        Product door = new Product("door", 30);
        Product window = new Product("window", 20);
        Product wall = new Product("wall", 50);

        Collection<Product> productCollection = new ArrayList<>();
        productCollection.add(door);
        productCollection.add(window);
        productCollection.add(wall);

        Iterator<Product> productIterator = productCollection.iterator();

        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() < 25) {
                productIterator.remove(); // You cant do this operation usign a foreach loop ***
            }
        }
        System.out.println(productCollection);
    }
}
