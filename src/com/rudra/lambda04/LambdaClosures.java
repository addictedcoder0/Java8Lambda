package com.rudra.lambda04;

import org.omg.CORBA.INTERNAL;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by abhishek.
 */
public class LambdaClosures {
    public static void main(String[] args) {
        int key = 2;
        int i=10;

        // now key is coming from local scope , and compiler freezes it by making it final(effectively final).
        process(i,a-> System.out.println(a+key));

    }

    static void process(int i,Consumer<Integer> consumer){
        consumer.accept(i);
    }
}
