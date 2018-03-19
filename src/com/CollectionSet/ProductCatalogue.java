package com.CollectionSet;


import java.util.*;

import static com.CollectionSet.Product.BY_WEIGHT;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class ProductCatalogue implements Iterable<Product> {

    public Set<Product> getProductSet() {
        return productSet;
    }

    //to demo TreeSet- which mantains uniqueness
    private Set<Product> productSet = new HashSet<>();

    public Set<Product> getProductTreeSet() {
        return productTreeSet;
    }

    //to demo TreeSet- which mantains uniqueness and order
    private Set<Product> productTreeSet = new TreeSet<>(BY_WEIGHT);

    //Using Sorted Set interface
    public SortedSet<Product> productSortedSet = new TreeSet<>(BY_WEIGHT);

    public void suppliedBy(Supplier supplier) {

        productSet.addAll(supplier.getProducts());
        productTreeSet.addAll(supplier.getProducts());
        productSortedSet.addAll(supplier.getProducts());
    }

    public Set<Product> heavyWeight(){

        Product heavyWeight = divideELements();
         return productSortedSet.tailSet(heavyWeight);

    }

    public Set<Product> lightWeight(){

        Product lightWeight = divideELements();
        return productSortedSet.headSet(lightWeight);

    }

    public Product divideELements() {

        for (Product productSet : productSortedSet) {
               if(productSet.getWeight()>20){
                   return productSet;
               }
        }
        return  productSortedSet.last();
    }

    @Override
    public Iterator<Product> iterator() {
        return productSet.iterator();
    }
}
