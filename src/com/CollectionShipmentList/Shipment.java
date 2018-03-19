package com.CollectionShipmentList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mallika Aruva on 2/15/2018.
 */
public class Shipment implements Iterable<ShipmentProduct> {

    private static final int LIGHT_MINI_VAN_WEIGHT = 20;

    public List<ShipmentProduct> lightWeightProducts = new ArrayList<>();
    public List<ShipmentProduct> heavyWeightProducts = new ArrayList<>();

    public List<ShipmentProduct> productList = new ArrayList<>();


    public void add(ShipmentProduct e) {
        productList.add(e);

    }

    public void replace(ShipmentProduct oldProduct, ShipmentProduct newProduct) {
        //find the index of the old product and repalce new object to old index
        final int index = productList.indexOf(oldProduct);
        if (index != -1) {
            productList.set(index, newProduct);
        }

    }

    public void prepare() {
        //Step1 : sort the list based on weight
        productList.sort(ShipmentProduct.BY_WEIGHT);

        //Step2 : find the pinch point where we can differentiate between hevay and light weights
        int pinchPoint = findPinchPoint();

        //Step3: Fill in Heavy weight and light weight vans
        lightWeightProducts = productList.subList(0, pinchPoint);
        heavyWeightProducts = productList.subList(pinchPoint, productList.size());
    }


    public List<ShipmentProduct> getLightWeightProducts() {
        return lightWeightProducts;
    }

    public List<ShipmentProduct> getHeavyWeightProducts() {
        return heavyWeightProducts;
    }

    public List<ShipmentProduct> getProductList() {
        return productList;
    }

    private int findPinchPoint() {
        for (int i = 0; i < productList.size(); i++) {

            final ShipmentProduct product = productList.get(i);
            if (product.getWeight() > LIGHT_MINI_VAN_WEIGHT) {
                return i;
            }

        }

        return 0;
    }

    @Override
    public Iterator<ShipmentProduct> iterator() {
        return productList.iterator();
    }


}
