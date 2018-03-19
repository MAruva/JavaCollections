package com.company;

/**
 * Created by Mallika Aruva on 2/22/2018.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] input = {10, 1, 6, 2};
        int length = input.length;
        int temp = 0;

        for (int i = 0; i < length; i++) {
            System.out.print(input[i] + ",");
        }


        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        System.out.println("-------------------------------------------");
        for (int i = 0; i < length; i++) {
            System.out.print(input[i] + ",");
        }
    }
}
