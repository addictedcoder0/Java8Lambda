package com.rudra.stream06;

import com.rudra.lambda02.Gender;
import com.rudra.lambda02.People;
import com.rudra.lambda02.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by abhishek.
 */
public class StreamToMap {
    public static void main(String[] args) {
        List<Person> people = People.getPeople();

        System.out.println("**** TASK[1] : collect the map of people with Gender=>Male");
        Map<String,Person> maleMap = people.stream()
                                            .filter(p -> p.getGender() == Gender.Male)
                                            .collect(Collectors.toMap(
                                                    p -> p.getFirstName(),
                                                    p-> p
                                            ));

        System.out.println(" Map of Male people : "+maleMap);

        System.out.println("***** Groupingby the people list on the basis of Gender *****");
        System.out.println(
                people.stream()
                    .collect(Collectors.groupingBy(p->p.getGender()))
        );
    }
}
