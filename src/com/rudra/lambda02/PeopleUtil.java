package com.rudra.lambda02;

import java.util.Collections;
import java.util.List;

/**
 * Created by abhishek.
 */
public class PeopleUtil {
    /*
     */
    public static void main(String[] args) {
        People people = new People();

        /*   Tasks to be performed  */

        // 1. Sort the person List by lastName .
        Collections.sort(people.getPeople(),(p1,p2)->{
            // compareTo() returns alphabetical order based Sorting , UpperCase char has high priority.
            return p1.getLastname().compareTo(p2.getLastname());
        });

        System.out.println(" ********* People sorted by lastName ********* ");
        printAll(people.getPeople(),(p)->true); // lambda based printing approach

        // 2. filter out all the people whose lastName starts with 'C' or 'c'
        System.out.println("\n ********* People have lastName startWith \"C\" or \"c\" ******** ");
        printAll(people.getPeople(),(p)->{
            return p.getLastname().startsWith("C")||p.getLastname().startsWith("c");
        });

        // ( or ) we can reuse the generic interface provided by java which has the same signature as of our interface NameList

    }

    static void printAll(List<Person> peopleList,Namefilter condition){
        for(Person p : peopleList){
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
@FunctionalInterface
interface Namefilter{
    boolean test(Person p);
}
