package com.rudra.stream07;

import java.util.stream.Stream;

/**
 * Created by abhishek.
 */
public class StreamProps {
    public static void main(String[] args) {

        /*
        Streams are mostly have the same property as of the collections over which they have been invoked
        Stream has distinct() and sorted() methods in order to change the streams on-fly
         */

        /*
        Infinite Streams => advanced type of iterators
         */

        System.out.println("***** TASK[1] : find the sum of numbers Double of 'n' integers start from 'k' and have following props :\n 1 . even\n2 . its sqrt>20 *****");
        int k=10;
        int n= 10;
        int weird_sum = Stream.iterate(k,e -> e+1)   // starts infinite series start from 'k';unbounded and lazy
                .filter(e->e%2==0)
                .filter(e->Math.sqrt(e)>20)
                .mapToInt(e->e*2)
                .limit(n)   // get upto 'n' counts and then stop
                .sum();
        System.out.println("sum : "+weird_sum);
    }
}
