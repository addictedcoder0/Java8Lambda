package com.rudra.stream04;

import com.rudra.PerformanceMeasurer.Timer;
import com.rudra.stream02.MethodRef_withStreams;

import java.util.List;

/**
 * Created by abhishek.
 */
public class ParallelStreamsIntro {
    public static void main(String[] args) {
        List<Integer> numbers = MethodRef_withStreams.numbers;

        System.out.println("*** stream() performance **********");
        // measuring the performance with stream()
        Timer.code(() ->
                System.out.println(numbers.stream()
                        .filter(n -> n % 2 != 0)
                        .mapToInt(n -> delay(n))
                        .map(n -> n * 2)
                        .reduce(0, Integer::sum)));


        System.out.println("*** parallelStream() performance **********");
    // measure the performance with parallelStreams() => unleashes multiple threads on this
        Timer.code(() ->
                System.out.println(numbers.parallelStream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> delay(n))
                .map(n -> n * 2)
                .reduce(0, Integer::sum)));

        /*
            a Parallel Stream uses many threads , but be careful when you use it
            opt when following conditions are met :
            1. plenty of resources
            2. there is no interdependency among data
            3. you have a high amount of data (on small size , parallel will turn out to be a overhead).
         */

        }


    public static int delay(int n){
        try{Thread.sleep(1000);
        }
        catch (Exception e){}
        return n;
    }
}
