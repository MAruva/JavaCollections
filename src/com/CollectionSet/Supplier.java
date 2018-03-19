package com.CollectionSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class Supplier {

    private String supplierName;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private List<Product>products= new ArrayList<>();




    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }



    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

}
