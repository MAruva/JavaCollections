package com.CollectionDoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Mallika Aruva on 2/16/2018.
 */
public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value = calculator.evaluateSum("1 + 7 - 4 ");
        System.out.println("" + value);
    }


    public int evaluateSum(String s) {

        int sum = 0;
        Deque<String> stringDeque = new ArrayDeque<>();

        //1.Split th string into token
        String[] tokens = s.split(" ");
        //2.add into stack
        for (String token : tokens) {
            stringDeque.add(token);
        }
        // add elements under the size of the stack is one

        while (stringDeque.size() > 1) {
            //lets have first element , operator , second element

            int first = Integer.parseInt(stringDeque.pop());
            String operator = stringDeque.pop();
            int second = Integer.parseInt(stringDeque.pop());


            switch (operator) {
                case "+":
                    sum = (first + second);
                    break;
                case "-":
                    sum = (first - second);
                    break;

            }
            stringDeque.push(String.valueOf(sum));
        }

        return Integer.parseInt(stringDeque.pop());
    }
}
