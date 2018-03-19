package com.company;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        // write your code here
        int a, b, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a");
        a = scanner.nextInt();
        System.out.println("Enter the number b");
        b = scanner.nextInt();
        sum=a+b;
        System.out.println("sum of a and b is : "+sum);

    }
}
