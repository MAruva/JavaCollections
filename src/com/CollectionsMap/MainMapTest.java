package com.CollectionsMap;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class MainMapTest {
    public static void main(String[] args) {
        DemoLookUp demoLookUp = new DemoLookUp();
        //see if this added
        demoLookUp.addProduct(new Product("Java", 20, 1));

        Product product = demoLookUp.lookUpByID(1);
        System.out.println(product.getName());

        //Checking for duplicates, should throw exception
        demoLookUp.addProduct(new Product("angular", 50, 1));
        Product product2 = demoLookUp.lookUpByID(1);
        System.out.println(product.getName());

    }
}
