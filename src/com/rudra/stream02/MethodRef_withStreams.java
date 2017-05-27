package com.rudra.stream02;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek.
 */
public class MethodRef_withStreams {
    public static List<Integer> numbers  = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    public static void main(String[] args) {
        //Immutable List of elements


        System.out.println("******* TASK[1] : print all the numbers *******");
        numbers.stream().forEach(System.out::println);

        System.out.println("****** TASK[2] : print the sum of all these numbers");
        /*System.out.println
                (numbers.stream().reduce(0, (total, element) -> Integer.sum(total, element)));
        */
        //method ref version
        System.out.println
                (numbers.stream().reduce(0, Integer::sum));

        /*
            Method reference can't be used in the following cases :
                1: when we have a conflict b/w instance and static methods
                2: when we have to perform some extra activity over the passed argument.
         */


    }
}
