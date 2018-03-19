package com.CollectionSet;

import com.sun.media.sound.AiffFileReader;
import com.sun.media.sound.WaveExtensibleFileReader;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class ProductCatalogueDeal {

    public static void main(String[] args) {

        Product door = new Product("Door", 25);
        Product window = new Product("window", 35);
        Product aisle = new Product("Aisle", 55);

        Supplier Annie = new Supplier("Annie's ");
        Supplier Mary = new Supplier("Mary's ");

        Annie.getProducts().add(door);
        Mary.getProducts().add(door);
        Annie.getProducts().add(aisle);
        Mary.getProducts().add(window);


        ProductCatalogue productCatalogue = new ProductCatalogue();

        productCatalogue.suppliedBy(Annie);
        productCatalogue.suppliedBy(Mary);


        //  A Set Collection shows only unique items in the Collections .
        for (Product product : productCatalogue.getProductSet()) {
            System.out.println(product);
        }
        System.out.println("--------Test1----------------");

        // If equals ad hashcode method are not implemented, there would be a  error since it considers it a s a different object.
        Annie.getProducts().add(new Product("Door", 25));

        for (Product product : productCatalogue.getProductSet()) {
            System.out.println(product);
        }
        System.out.println("--------Test2----------------");

        //Implementing a Treeset - uniqueness+sort->just adda comparator to order things based on an property
        Product eise = new Product("Eise", 15);
        Annie.getProducts().add(eise);
        productCatalogue.suppliedBy(Annie);
        for (Product product : productCatalogue.getProductSet()) {
            System.out.println(product);
        }
        System.out.println("--------Test3----------------");

        // This is to test how we use a Sorted Set implementation to sort elements

        System.out.println("Heavy -Weight");
        for (Product product : productCatalogue.heavyWeight()) {
            System.out.println(product);
        }
        System.out.println("Light -Weight");
        for (Product product : productCatalogue.lightWeight()) {
            System.out.println(product);
        }
        System.out.println("--------Test4----------------");
    }
}
