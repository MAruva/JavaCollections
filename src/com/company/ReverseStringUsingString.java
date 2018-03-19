package com.company;

import java.util.Scanner;

/**
 * Created by Mallika Aruva on 2/21/2018.
 */
public class ReverseStringUsingString {

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        char[] n = s.nextLine().toCharArray();
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i]);
        }
    }
}
