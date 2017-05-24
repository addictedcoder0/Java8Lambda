package com.rudra.lambda02;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by abhishek.
 */
public class PeopleUtil {

    public static void main(String[] args) {
        People people = new People();

        /*   Tasks to be performed  */

        // 1. Sort the person List by lastName .
        Collections.sort(people.getPeople(),(p1,p2)->{
            // compareTo() returns alphabetical order based Sorting , UpperCase char has high priority.
            return p1.getLastname().compareTo(p2.getLastname());
        });

        System.out.println(" ********* People sorted by lastName ********* ");
        // lambda based printing approach

        performConditionally(people.getPeople(),
                (p) -> true,
                (p) -> {
                    System.out.println(p);
                }
        );


        // 2. filter out all the people whose lastName starts with 'C' or 'c'
        System.out.println("\n ********* People have lastName startWith \"C\" or \"c\" ******** ");

        // we can introduce a behavior (NameList) which can perform the conditional check for us

        /*printAll(people.getPeople(),(p)->{
            return p.getLastname().startsWith("C")||p.getLastname().startsWith("c");
        });
        */

        // ( or ) we can reuse the generic functional behavior provided by java8 .
        performConditionally(people.getPeople(),
                (p) -> {
                    return p.getLastname().startsWith("C") || p.getLastname().startsWith("c");
                },
                (p) -> System.out.println("## operation specific to conditional printing #### " + p)
        );

    }

    static void performConditionally(List<Person> peopleList, Predicate<Person> condition, Consumer<Person> operation){
        for(Person p : peopleList){
            if(condition.test(p)) {
                // still we have a hardcoded operation , we can use lambda to make it dynamic.
                //System.out.println(p);

                // lambda based dynamic operation call
                operation.accept(p);

            }
        }
    }

}
/*
not in use anymore , as i am using functional interface Predicate<T>

@FunctionalInterface
interface Namefilter{
    boolean test(Person p);
}
*/
