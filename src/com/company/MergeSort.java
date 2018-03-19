package com.company;

/**
 * Created by Mallika Aruva on 2/22/2018.
 */
public class MergeSort {


    public static void main(String[] args) {

        int[] leftArray = {6, 2, 4, 9};
        int[] rightArray = {5, 3, 7, 1};
        int[] totalArray = new int[leftArray.length + rightArray.length];
        int left = totalArray.length / 2;
        int right = totalArray.length - left;


        //print if  elements are in sorted arrays
        sort(leftArray, rightArray, totalArray, left, right);

        Merge(leftArray, rightArray, totalArray);
        for (int i = 0; i < totalArray.length; i++) {
            System.out.print(totalArray[i] + ",");
        }

    }

    private static int[] sort(int[] leftArray, int[] rightArray, int[] totalArray, int left, int right) {
        if (totalArray.length < 2) {
            return totalArray;
        }
            while (totalArray.length < 2) {
                for (int i = left; i < totalArray.length; i++) {
                    rightArray[i - right] = totalArray[i];
                }
                for (int i = 0; i < left; i++) {
                    leftArray[i] = totalArray[i];
                }
            }

        return totalArray;
    }


    private static void Merge(int[] leftArray, int[] rightArray, int[] totalArray) {

        //Merge Algorithm
        int k = 0;
        int j = 0;
        int i = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                totalArray[k] = leftArray[i];
                k++;
                i++;
            } else {
                totalArray[k] = rightArray[j];
                k++;
                j++;
            }
        }
        while (i < leftArray.length) {
            totalArray[k] = leftArray[i];
            k++;
            i++;
        }

        while (j < rightArray.length) {
            totalArray[k] = rightArray[j];
            k++;
            j++;
        }

    }

}

