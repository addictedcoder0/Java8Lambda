package com.rudra.stream05;

import com.rudra.stream02.MethodRef_withStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by abhishek.
 */
public class StreamReduceOps {

    public static void main(String[] args) {
        List<Integer> numbers = MethodRef_withStreams.numbers;
        List<Integer> duplicateNumbers =  Arrays.asList(11,2,32,3,4,4,54,5,5,6,7,7);
        List<Integer> evenCollection = new ArrayList<>();
        List<Integer> oddCollection = new ArrayList<>();

        /*
         Note : sum() and collect() are special reduce() operations , designed for specific purpose
         */
        System.out.println(" Task[1] : find the sum of all numbers ");
        System.out.println(
                numbers.stream()
                        .reduce(0, Integer::sum));

        System.out.println(" Task[2] : find the sum of all even numbers ");
        System.out.println(
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .reduce(0, Integer::sum));

        System.out.println(" Task[3] : collect all even numbers in a list ");

        evenCollection=  numbers.stream()
                        .filter(n->n%2==0)
                    //  .forEach(n->evenCollection.add(n)) // don't ever do this -> use collect()
                    // Note : Mutability is ok , sharing is nice but sharedMutability is worst practice
                        .collect(Collectors.toList());
        System.out.println(evenCollection);
    }

}
