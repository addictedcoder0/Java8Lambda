package com.rudra.stream01;

import com.rudra.lambda02.People;
import com.rudra.lambda02.Person;

import java.util.List;

/**
 * Created by abhishek.
 */
public class StreamIntro {
    public static void main(String[] args) {
        List<Person> people = People.getPeople();

        System.out.println("****** TASK[1] : print the firstName of All people ********");

        //people.stream().forEach(p->System.out.println(p.getFirstName()));
        people.forEach(p-> System.out.println(p.getFirstName()));

        System.out.println("****** TASK[2] : print only those name , whose lastname startswith \"C\" or \"c\" ********");
        people.stream()
                .filter(p->p.getLastname().startsWith("C")||p.getLastname().startsWith("c"))
                .forEach(p->System.out.println(p.getLastname()));


        /* stream()
         * filter (Predicate<T>)
         * :
         * :
         * forEach(Consumer<T>)  // terminal condition
         *
         * Note :
         * streams don't start un till they find a terminal operation in the chain
         */

        long count = people.stream()
                .filter(p->p.getLastname().startsWith("C")||p.getLastname().startsWith("c"))
                .count();
        System.out.println("count : "+count);
    }
}
