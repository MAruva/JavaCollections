package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mallika Aruva on 2/22/2018.
 */
public class IsomorphicString {

    // Two Strings are isomorphic if the characters of one string when jumbled makes the other string

    public static void main(String[] args) {
        System.out.println("Enter the first String");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        System.out.println("Enter the second String");
        String string2 = scanner.nextLine();
        System.out.println("-----------Are these two Strings ISOMORPHIC ?------------");
        if (string1.length() == string2.length()) {
            char[] sequence = string2.toCharArray();
            for (char c : sequence) {
//                if (string1.contains()) {
//                    System.out.println("Given two strings are ISOMORPHIC");
//                }
            }

        } else {
            System.out.println("Given two strings are NOT ISOMORPHIC");
        }

    }


}
