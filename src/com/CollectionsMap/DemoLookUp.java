package com.CollectionsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class DemoLookUp implements ProductLookUpTable {
    public Map<Integer, Product> productMap = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        //to see uniqueness
        if (productMap.containsKey(product.getId())) {
            throw new IllegalArgumentException("System doesnt allow Duplicates");
        } else {
            productMap.put(product.getId(), product);

        }
    }

    @Override
    public void clear() {
        productMap.clear();
    }

    @Override
    public Product lookUpByID(int id) {

        return productMap.get(id);
    }
}
