package com.company;

import java.util.Scanner;

/**
 * Created by Mallika Aruva on 2/8/2018.
 */
public class SecondProblem {

    public static void main(String[] args) {
        int number, sum;
        sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of digits you want to add");
        number = scanner.nextInt();

        System.out.println("Enter the digits");

        for (int i = 0; i < number; i++) {
            sum = sum + scanner.nextInt();
        }
        System.out.println("Sum :" + sum);

    }
}
