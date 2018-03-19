package com.company;

import java.util.*;

/**
 * Created by Mallika Aruva on 2/22/2018.
 */
public class RotateElements {

    public static void main(String[] args) {
        Comparator<Integer> integerComparator = Integer::compareTo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 digits");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
//sort based on a comaparator
        list.sort(integerComparator);
        for (int i:list){
            System.out.println(i);
        }

        System.out.println("----------------------------");
        //rotate based on distance the elements have to move
        Collections.rotate(list,1);
        for (int i:list){
            System.out.println(i);
        }

    }
}
