package com.rudra.lambda05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by abhishek.
 */
public class LambdaAndReferences {
    public static void main(String[] args) {
        List<Integer> numbers  = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        LambdaAndReferences lr = new LambdaAndReferences();
        lr.thisReference(numbers);
        lr.Methodreference(numbers);
    }

    void thisReference(List<Integer> numbers){
        // lambda don't change the value of 'this',they aren't like anon inner classes
        process(numbers, i -> System.out.println(" this ref is : " + this + " number is :" + i));
    }

    void Methodreference(List<Integer> numbers){
        // once the behavior is static and parameters justify the behavior parameters
        // we can go for Method references , shorthand notation
        process(numbers,System.out::println);
    }
    void process(List<Integer> numbers ,Consumer<Integer> consumer){
        for(int i:numbers) {
            consumer.accept(i);
        }
    }
}
