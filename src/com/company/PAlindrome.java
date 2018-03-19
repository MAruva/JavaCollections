package com.company;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

/**
 * Created by Mallika Aruva on 2/22/2018.
 * <p>
 * Strings when reversed if produce same strings are palindromes
 */
public class PAlindrome {

    public static void main(String[] args) {
        System.out.println("Enter your string . We will tell if it is a Palindrome");

        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string1);
        String string2 = String.valueOf(stringBuilder.reverse());

        if (string1 != null && string2 != null && string1.equals(string2)) {
            System.out.println("Congrats! your String is a  Palindrome");
        } else {
            System.out.println("No! your String is not a Palindrome");

        }
    }
}
