package com.CollectionQueue;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class Customer {

    private String name;

    public static final Customer JACK = new Customer("JACK");
    public static final Customer SANSA = new Customer("SANSA");

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public static final Customer TYLER = new Customer("TYLER");


    public Customer(String name) {
        this.name = name;
    }

    public void reply(String message) {
        System.out.println(name + "," + message);
    }
}
