package com.rudra.lambda01;

/**
 * Created by abhishek.
 */
public class Greeter {

    // passing the object which contains the behavior
    public void greet(Greeting greeting){
        greeting.greet();
    }

    // goal of lambda is to pass the behavior alone and execute it without any object.

    
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // concrete implementation n
        Greeting greetingImpl =  new GreetingImpl();
        greeter.greet(greetingImpl);

        // anonymous inner class based implementation
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("hello from the Anonymous Inner class of Greeting");
            }
        };
        greeter.greet(greeting);

        // lambda based implementation
        Greeting greetLambda =  () -> System.out.println("hello from the lambda impl of Greeting");
        greeter.greet(greetLambda);
    }
}

interface Greeting{
    void greet();
}

class GreetingImpl implements Greeting{
    // public access specifier is mandatory , as withoutnit the scope of greet will reduce
    public void greet(){
        System.out.println("hello from GreetingImpl class");
    }
}