package com.company;

import java.util.*;
import java.io.*;

/**
 * Created by Mallika Aruva on 2/21/2018.
 */
public class ReverseString {


    public static String FirstReverse(String str) {

        // code goes here
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        String reversedString= stringBuilder.reverse().toString();

    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        return reversedString;

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}

