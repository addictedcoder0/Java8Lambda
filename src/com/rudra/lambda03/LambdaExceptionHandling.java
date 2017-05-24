package com.rudra.lambda03;

import java.util.function.BiConsumer;

/**
 * Created by abhishek.
 */
public class LambdaExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int key_0 = 2;
        int key_1 = 0; // this will cause exception

        //execute(numbers ,key_0 ,(n,k)-> System.out.println(n/k));
        execute(numbers ,key_0 ,wrapper((n,k)-> System.out.println(n/k)));
        // if exception occurs in lambda
        // then it is the best practice to wrap the current lambda into another lambda
        execute(numbers, key_1, wrapper((n, k) -> System.out.println(n / k)));
    }

    static void execute(int[] numbers , int key , BiConsumer<Integer,Integer> consumer){
        for(int number : numbers){
            consumer.accept(number,key);
        }
    }

    static BiConsumer<Integer,Integer> wrapper(BiConsumer<Integer,Integer> consumer) {
        return (n,k)-> {
            try {
                consumer.accept(n, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception occurred");
            }
        };
    }


}
