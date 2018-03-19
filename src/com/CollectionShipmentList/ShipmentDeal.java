package com.CollectionShipmentList;

/**
 * Created by Mallika Aruva on 2/15/2018.
 */
public class ShipmentDeal {

    public static final int PRPDUCT_NOT_PRESENT = -1;

    public static void main(String[] args) {

        //to add in the List Collection

        ShipmentProduct door = new ShipmentProduct("door", 30);
        ShipmentProduct window = new ShipmentProduct("window", 15);
        ShipmentProduct wall = new ShipmentProduct("wall", 50);

        Shipment shipmentProducts = new Shipment();
        shipmentProducts.add(door);
        shipmentProducts.add(window);
        shipmentProducts.add(wall);

        for (ShipmentProduct shipmentProducts1 : shipmentProducts.getProductList()) {
            System.out.println(shipmentProducts1);
        }
        System.out.println("___________________________________________");

        //---------------------------------------------------------------------------------------------

        //to replace a item in the Collection List
        ShipmentProduct aisle = new ShipmentProduct("Aisle", 50);

        shipmentProducts.replace(wall, aisle);

        for (ShipmentProduct shipmentProducts1 : shipmentProducts.getProductList()) {
            System.out.println(shipmentProducts1);
        }
        System.out.println("___________________________________________");

        //-----------------------------------------------------------------------------------------------

        // To use Heavy and Light weight vans based on weight of items inside

        shipmentProducts.prepare();
        System.out.println("Heavy weight items are : ");
        for (ShipmentProduct shipmentProducts1 : shipmentProducts.getHeavyWeightProducts()) {
            System.out.println(shipmentProducts1);
        }
        System.out.println("____________________________");
        System.out.println("Light weight items are : ");
        for (ShipmentProduct shipmentProducts1 : shipmentProducts.getLightWeightProducts()) {
            System.out.println(shipmentProducts1);
        }
        System.out.println("____________________________");
    }

}
