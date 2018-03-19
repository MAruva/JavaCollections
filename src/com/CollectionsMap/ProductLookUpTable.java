package com.CollectionsMap;

import com.Collections.*;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public interface ProductLookUpTable {

    void addProduct(Product product);

    void clear();

    Product lookUpByID(int id);
}
