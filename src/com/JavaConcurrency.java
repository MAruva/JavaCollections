package com;

import java.util.Arrays;

/**
 * Created by Mallika Aruva on 3/9/2018.
 */
public class JavaConcurrency {


    public static class test extends Thread {

        String country;

        public test(String country) {
            super(country + "thread");
            this.country = country;
        }

        public void run() {
            System.out.println("Test class " + country);
        }
    }


    public static void main(String[] args) {
        String[] countries = {"USA", "India", "Germany", "Australia", "France", "Russia", "SriLanka", "Pakisthan"};

        Arrays.stream(countries);
        for (String count : countries) {

            new test(count).run();
        }
    }

}
