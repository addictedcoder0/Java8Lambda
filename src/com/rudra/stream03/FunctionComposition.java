package com.rudra.stream03;

import com.rudra.PerformanceMeasurer.Timer;
import com.rudra.stream02.MethodRef_withStreams;

import java.util.List;

/**
 * Created by abhishek.
 */
public class FunctionComposition {
    public static void main(String[] args) {
        List<Integer> numbers = MethodRef_withStreams.numbers;
        System.out.println("******** TASK[3] : make a string by combining all the numbers");
        System.out.println(numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(String::valueOf) // is to convert int -> String
                        //.reduce("",(carry,str)->carry.concat(str)));
                .reduce("", String::concat)); // method reference

        System.out.println("********* TASK[4] : find the sum of all even numbers");
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(" sum of even numbers :" + sum);

        System.out.println("********* TASK[5] : find all odd numbers and double them and sum them up");
        int sum_odd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        // alternate way

        int sum_odd_alt = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * 2)
                .sum();
        System.out.println(" sum of even numbers :" + sum_odd_alt);

    }
}
