package com.rudra.lambda06;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek.
 */
public class ForEachIteration {

    public static void main(String[] args) {
        List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // forEach => Internal Iterator , just used to iterate & order is not a priority here
        // forEach(Consumer<T> consumer)
        // internal iterator can be executed on the multiple processors , external iterator can't

        //numbers.forEach(n->System.out.println(n));
        numbers.forEach(System.out::println);
    }
}
