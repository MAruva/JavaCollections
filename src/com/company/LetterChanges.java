package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mallika Aruva on 2/21/2018.
 */
public class LetterChanges {

    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] array = str.toCharArray();
        int i = 0;
        for (char c : array) {
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c + 1 - 'a') % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c + 1 - 'A') % 26);
            }
            if (c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'a') {
                c = (char) (((int) c) - 32);
            }
            array[i++] = c;
        }
        System.out.print(array);
    }
}
